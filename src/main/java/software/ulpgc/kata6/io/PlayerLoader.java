package software.ulpgc.kata6.io;

import software.ulpgc.kata6.model.Player;

import java.io.IOException;
import java.util.List;

public interface PlayerLoader {
    List<Player> load() throws IOException;
}
