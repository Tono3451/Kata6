package software.ulpgc.kata6.model;

public record Player(String name, String nationality, String position, String squad, League league) {

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", position='" + position + '\'' +
                ", squad='" + squad + '\'' +
                ", league=" + league +
                '}';
    }
}
