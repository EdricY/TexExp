# Project - Domain Specific Language
## Live demo: http://imani-muya.xyz/TexExp/

## Student Info

Names: Alison Bell and Edric Yu

Operating system: Ubuntu 16.04.4 LTS

Lab computer or your own computer: Lab Computers

Did you receive help from your instructor? Not much. We received a few ANTLR tips from Luke Brom

Who did what portions of the project? We pair-programmed it together.

## What is TexExp?
There are many situations that requiring arranging and formatting text according to a regular, repeated template. For example:

* A PowerPoint for song lyrics with repeated refrains/choruses
* Mail merge: generating emails customized for specific people
* Workout plans
* Daily to-do lists and schedules

Arranging this kind of text manually can be a tedious and error-prone task. TexExp allows users to define just the meaningful blocks of text and template structure, and then have the text automatically generated with the appropriate sections filled in. This means that the user can focus on the important parts (like the correct song lyrics or the right wording for an email) while TexExp handles the repetitive work and keeps a consistent structure.

# Basic Usage
TexExp uses "template" files (ending in .te), which have two sections: one for variables and one for the output template, separated by ">>>". The variables define pieces of text, and the output template defines how that text should be arranged in the output. For example, here is a very simple template:

``` plaintext linenumbers
[verse1]
Amazing Grace how sweet the sound
That saved a wretch like me
I once was lost but now am found
Was blind but now I see

[verse2]
'Twas grace that taught my heart to fear
And grace my fear relieved
How precious did that grace appear
The hour I first believed

>>>
$verse1

$verse2
```
To generate the output for this template, save it in a file (AmazingGrace.te) and then run `TexExpTranslator`, passing the file as an argument. TexExp will print out: 

``` plaintext linenumbers
Amazing Grace how sweet the sound
That saved a wretch like me
I once was lost but now am found
Was blind but now I see

'Twas grace that taught my heart to fear
And grace my fear relieved
How precious did that grace appear
The hour I first believed
```

# Features
## Variables

In the section of variables at the top of a .te file, TexExp supports inline variables, which cannot include newlines:
``` plaintext linenumbers
title = Amazing Grace
```

Block variables, which are delimited by two newlines:
``` plaintext linenumbers
[verse1]
Amazing Grace how sweet the sound
That saved a wretch like me
I once was lost but now am found
Was blind but now I see

```

And array variables:
``` plaintext linenumbers
numbers = {1, 2, 3}
verses  = {$verse1, $verse2, $verse3}
```

In the template section of the .te file, a single inline or block variable can be referenced with the `$` operator:
``` plaintext linenumbers
$title
$verse1
```

Here's a complete example of a .te file:

``` plaintext linenumbers
title = Amazing Grace

[verse1]
Amazing Grace how sweet the sound
That saved a wretch like me
I once was lost but now am found
Was blind but now I see

[verse2]
'Twas grace that taught my heart to fear
And grace my fear relieved
How precious did that grace appear
The hour I first believed

[refrain]
My chains are gone, I've been set free
My God, my Savior has ransomed me
And like a flood his mercy reigns
Unending love, amazing grace

>>>
$title

$verse1

Refrain
$refrain

$verse2

Refrain
$refrain

```

This would produce the output:

``` plaintext linenumbers
Amazing Grace

Amazing Grace how sweet the sound
That saved a wretch like me
I once was lost but now am found
Was blind but now I see

Refrain
My chains are gone, I've been set free
My God, my Savior has ransomed me
And like a flood his mercy reigns
Unending love, amazing grace

'Twas grace that taught my heart to fear
And grace my fear relieved
How precious did that grace appear
The hour I first believed

Refrain
My chains are gone, I've been set free
My God, my Savior has ransomed me
And like a flood his mercy reigns
Unending love, amazing grace

```

## Iteration

Arrays can be referenced using the `@` operator, which will loop over them and generate a new copy of the template for each element of the array. For example, this template:
``` plaintext linenumbers
@verses
$refrain
```
will print out the first verse followed by the refrain, then the next verse followed by the refrain, and so forth until all the verses in the `verses` array have been looped through.

If there are multiple `@` array references in the same template, the arrays will be looped over in parallel. The first copy of the template will contain the first element of both arrays, then the second copy will contain the second element of both arrays, and so forth.

Using `@`'s, we can make a template like the one above much cleaner! Here's a new .te file using `@`'s.

``` plaintext linenumbers
[verse1]
Amazing Grace how sweet the sound
That saved a wretch like me
I once was lost but now am found
Was blind but now I see

[verse2]
'Twas grace that taught my heart to fear
And grace my fear relieved
How precious did that grace appear
The hour I first believed

[refrain]
My chains are gone, I've been set free
My God, my Savior has ransomed me
And like a flood his mercy reigns
Unending love, amazing grace

numbers = {1, 2}
verses  = {$verse1, $verse2}

>>>
Verse @numbers
@verses

Refrain
$refrain

```

This will produce the output:
``` plaintext linenumbers
Verse 1
Amazing Grace how sweet the sound
That saved a wretch like me
I once was lost but now am found
Was blind but now I see

Refrain
My chains are gone, I've been set free
My God, my Savior has ransomed me
And like a flood his mercy reigns
Unending love, amazing grace

Verse 2
'Twas grace that taught my heart to fear
And grace my fear relieved
How precious did that grace appear
The hour I first believed

Refrain
My chains are gone, I've been set free
My God, my Savior has ransomed me
And like a flood his mercy reigns
Unending love, amazing grace

```

## Functions

TexExp has two kinds of built-in functions: _transformers_ and _deciders_. When you call a transformer function on some text, it changes it. For example:

``` plaintext linenumbers
Verse length: $verse1.len()

```

will output something like `Verse length: 118`.

Another transform function is `plus`, which can add numbers if the values they refer to are integers.
``` plaintext linenumbers
Total years: @undergradYears.plus(@gradYears)

```

## Conditionals

TexExp also contains many _decider_ functions, which you can use to conditionally include different array values. For example, one decider function is `gt`, or "greater than." If you give TexExp a template like this:

``` plaintext linenumbers
Dear @names,
Thank you for your @years.gt(1) years of service with us.

```

then TexExp will only generate copies where the `years` array element is greater than 1. That means that if the whole template looks like this:

``` plaintext linenumbers
names = {Dave, Ella, Abby}
years = {5,    1,    10}

>>>
Dear @names,
Thank you for your @years.gt(1) years of service with us.
```

then it will generate this output, skipping Ella because the corresponding `years` value is not greater than 1:

``` plaintext linenumbers
Dear Dave,
Thank you for your 5 years of service with us.

Dear Abby,
Thank you for your 10 years of service with us.

```

TexExp also supports conditional "subtemplates" marked by curly braces. This means that a whole template section will only be included if the condition is fulfilled. Here's an example template that includes a couple subtemplates:

``` plaintext linenumbers
names = {Dave, Ella, Abby}
years = {5,    1,    10}

>>>
Dear @names,
Thank you for your @years year{@years.gt(1) >>> s} of service with us.

{@years.gt(5) >>>
An especial congratulations to you for reaching @years years! Thank you for your faithfulness to our company.
}
=============================
```

This produces the output:

``` plaintext linenumbers
Dear Dave,
Thank you for your 5 years of service with us.


=============================
Dear Ella,
Thank you for your 1 year of service with us.


=============================
Dear Abby,
Thank you for your 10 years of service with us.

An especial congratulations to you for reaching 10 years! Thank you for your faithfulness to our company.

=============================
```

# Example
Here's an example demonstrating a variety of features:

``` plaintext linenumbers
contractor       = George
names            = {Dave, Ella, Abby, $contractor, Bob}
employeeYears    = {1,    0,    10,   5,           8}
contractingYears = {0,    0,     0,   3,           0}

[donuts]
-Jelly
-Glazed
-Chocolate

>>>
Dear @names,
Thank you for your @employeeYears.gt(0) year{@employeeYears.gt(1) >>> s} of employment with us.
{@contractingYears.gt(0) >>>
We are so glad to have had you for @employeeYears.plus(@contractingYears) years total!
}{@employeeYears.gt(5) @employeeYears.lt(10) >>>
An especial congratulations to you for reaching @employeeYears years. Your ten-year anniversary is coming soon!
}
There are donuts in the conference room for everyone celebrating their anniversary this month.

Donuts available:
$donuts

Enjoy,
The Boss
====================
```

This .te file produces this output:

``` plaintext linenumbers
Dear Dave,
Thank you for your 1 year of employment with us.

There are donuts in the conference room for everyone celebrating their anniversary this month.

Donuts available:
-Jelly
-Glazed
-Chocolate

Enjoy,
The Boss
====================

Dear Abby,
Thank you for your 10 years of employment with us.

There are donuts in the conference room for everyone celebrating their anniversary this month.

Donuts available:
-Jelly
-Glazed
-Chocolate

Enjoy,
The Boss
====================
Dear George,
Thank you for your 5 years of employment with us.
We are so glad to have had you for 8 years total!

There are donuts in the conference room for everyone celebrating their anniversary this month.

Donuts available:
-Jelly
-Glazed
-Chocolate

Enjoy,
The Boss
====================
Dear Bob,
Thank you for your 8 years of employment with us.
An especial congratulations to you for reaching 8 years. Your ten-year anniversary is coming soon!

There are donuts in the conference room for everyone celebrating their anniversary this month.

Donuts available:
-Jelly
-Glazed
-Chocolate

Enjoy,
The Boss
====================
```
