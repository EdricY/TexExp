grammar TexExp;

prog: declarations OUT wsOrEndl* template wsOrEndl* EOF;

declarations
    : '\n'* declaration declarations
    | //epsilon
    ;

declaration
    : inlineVar
    | blockVar
    ;

inlineVar : inlineDec inlineBody;

inlineDec : ID WS* '=' WS*;

inlineBody
    : arrayDec
    | decEntity
    ;

arrayDec: '{' decEntList wsOrEndl* '}';

decEntList
    : wsOrEndl* decEntity ',' decEntList
    | wsOrEndl* decEntity
    ; //no epsilon

decEntity : string | decVarRef;

entity : string | ref;

blockVar : BLOCKVAR;

decVarRef : '$' ID;

varRef : decVarRef methodCall?;

iterRef : iterSymbol ID methodCall?;

iterSymbol : '@'+;

methodCall : '.' ID '(' argList? ')';

argList
    : wsOrEndl* entity ',' argList
    | wsOrEndl* entity
    ; //no epsilon

template : (templateElement)+;

templateElement : entity | '\n' | subtemplate;

ref : varRef | iterRef;

subtemplate : '{' wsOrEndl* (ref wsOrEndl*)+ OUT wsOrEndl* template wsOrEndl* '}';

string : (ID | DIGIT | WS | legalSymbol)+?; //maybe ignore instead of matching leading spaces

legalSymbol //excludes @ $ {
    :'!'|'#'|'%'|'^'|'&'|'*'|'('|')'|'_'|'+'|'-'|'='
    |'['|']'|'\\'|'}'|'|'|'\''|'"'|';'|':'
    |'<'|'>'|'?'|','|'.'|'/'| '`'| '~'
    ;

wsOrEndl : WS | '\n';

OUT : '\n'* '>>>';
ID : LETTER (LETTER | DIGIT)*;
WS : '\t' | ' ' | '\u000C';
BLOCKVAR :  '[' ID ']\n' .*? '\n\n';
LETTER : [a-zA-Z];
DIGIT : [0-9];
