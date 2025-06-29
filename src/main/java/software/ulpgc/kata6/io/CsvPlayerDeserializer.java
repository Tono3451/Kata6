package software.ulpgc.kata6.io;

import software.ulpgc.kata6.model.Player;

public class CsvPlayerDeserializer implements PlayerDeserializer {
    @Override
    public Player deserialize(String line) {
        return deserialize(line.split(","));
    }

    private Player deserialize(String[] values) {
        return new Player(toInt(values[0]), values[1], values[2], removeQuotes(values[3]));
    }

    private int toInt(String value) {
        return Integer.parseInt(value);
    }

    private String removeQuotes(String value) {
        value = value.replace("\"", "");
        return value;
    }
}
