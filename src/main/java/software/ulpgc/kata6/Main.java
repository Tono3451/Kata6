package software.ulpgc.kata6;

import software.ulpgc.kata6.Api.SparkPlayerController;
import software.ulpgc.kata6.io.CsvPlayerDeserializer;
import software.ulpgc.kata6.io.FilePlayerLoader;
import software.ulpgc.kata6.io.PlayerLoader;
import software.ulpgc.kata6.model.Player;
import software.ulpgc.kata6.model.PlayerService;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        new SparkPlayerController(new PlayerService(loadPlayer()));
    }

    private static Map<Integer, Player> loadPlayer() throws IOException {
        PlayerLoader playerLoader = new FilePlayerLoader(
                new File("C:/Users/Tono3451/IdeaProjects/Kata6/players_data-2024_2025.csv"),
                new CsvPlayerDeserializer()
        );
        return playerLoader.load();
    }
}
