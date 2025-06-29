package software.ulpgc.kata6.model;

public record Player(int playerId, String name, String nationality, String position) {

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", position='" + position +
                '}';
    }
}
