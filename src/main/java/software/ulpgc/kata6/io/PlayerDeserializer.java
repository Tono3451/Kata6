package software.ulpgc.kata6.io;

import software.ulpgc.kata6.model.Player;

public interface PlayerDeserializer {
    Player deserialize(String line);
}
