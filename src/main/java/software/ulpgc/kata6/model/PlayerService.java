package software.ulpgc.kata6.model;

import java.util.List;
import java.util.Map;

public class PlayerService {
    private final Map<Integer, Player> players;

    public PlayerService(Map<Integer, Player> players) {
        this.players = players;
    }

    public List<Player> getListOfPLayers(){
        return players.values().stream().toList();
    }

    public Player getPlayerById(int id){
        return players.get(id);
    }
}
