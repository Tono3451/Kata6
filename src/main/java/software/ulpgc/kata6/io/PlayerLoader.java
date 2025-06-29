package software.ulpgc.kata6.io;

import software.ulpgc.kata6.model.Player;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface PlayerLoader {
    Map<Integer, Player> load() throws IOException;
}
