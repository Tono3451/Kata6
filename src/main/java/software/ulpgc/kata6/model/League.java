package software.ulpgc.kata6.model;

public enum League {
    PREMIERLEAGUE("Premier League"),
    LALIGA("La Liga"),
    LIGUE1("Ligue 1"),
    BUNDESLIGA("Bundesliga"),
    SERIAA("Serie A");

    private final String text;

    private League(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
