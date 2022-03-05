package FixtureBuilder;

public class Fixture<T extends Object> {

    private T homeTeam;
    private T awayTeam;

    public Fixture(T homeTeam,T avayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = avayTeam;
    }

    public T getHomeTeam() { return homeTeam; }

    public void setHomeTeam(T homeTeam) {
        this.homeTeam = homeTeam;
    }

    public T getAwayTeam() {
        return awayTeam;
    }

    public void setAvayTeam(T avayTeam) {
        this.awayTeam = avayTeam;
    }
}
