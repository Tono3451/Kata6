package software.ulpgc.kata6.io;

import software.ulpgc.kata6.model.Player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilePlayerLoader implements PlayerLoader{
    private final File file;
    private final PlayerDeserializer playerDeserializer;

    public FilePlayerLoader(File file, PlayerDeserializer playerDeserializer) {
        this.file = file;
        this.playerDeserializer = playerDeserializer;
    }

    @Override
    public Map<Integer, Player> load() throws IOException {
        Map<Integer, Player> players = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                Player player = playerDeserializer.deserialize(line);
                players.put(player.playerId(), player);
            }
        }
        return players;
    }
}
