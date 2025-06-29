package software.ulpgc.kata6.Api;

import com.google.gson.Gson;
import software.ulpgc.kata6.model.Player;
import software.ulpgc.kata6.model.PlayerService;
import spark.Spark;

import java.util.List;

public class SparkPlayerController {
    private final PlayerService playerService;
    private final Gson gson = new Gson();

    public SparkPlayerController(PlayerService playerService) {
        this.playerService = playerService;
        Spark.port(8080);
        getAllPlayers();
        getPlayersById();
    }

    private void getPlayersById() {
        Spark.get("/player/:id", ((request, response) -> {
            Player player = playerService.getPlayerById(Integer.parseInt(request.params(":id")));
            if (player == null) {
                response.status(404);
                return "404 - Player not found";
            }
            response.type("application/json");
            return gson.toJson(player);
        }));
    }

    private void getAllPlayers() {
        Spark.get("/player", ((request, response) -> {
            List<Player> players = playerService.getListOfPLayers();
            response.type("application/json");
            return gson.toJson(players);
        }));
    }
}
