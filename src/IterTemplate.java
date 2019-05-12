import java.util.ArrayList;

public class IterTemplate {

    public boolean invalid;

    ArrayList<Integer> positions;
    ArrayList<String> values;

    int amount;

    public IterTemplate() {
        positions = new ArrayList<>();
        values = new ArrayList<>();
        amount = 0;
    }

    public void addValue(int position, String value) {
        positions.add(position);
        values.add(value);
        amount++;
    }

    public void invalidate() {
        invalid = true;
    }


    // https://stackoverflow.com/questions/5884353/
    public String getOutput(String template) {
        if (invalid) return "";

        String output = template;
        for (int i = positions.size()-1; i >= 0; i--) {
            int position = positions.get(i);
            String value = values.get(i);
            output = new StringBuilder(output).insert(position, value).toString();
        }
        return output + "\n";
    }

    public int getAmount() {
        return amount;
    }
}

/*
 iterRef Listener makes IterTemplates

  on ExitProg IterTemplates do find and replace based on String baseTemplate
 */// wrong... will spawn new ones for names and years

/*
 iterRef Listener pushes onto existing IterTemplates or creates new ones IF first @@
 on ExitProg getOutput from all valid IterTemplates


 */