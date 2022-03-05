package FixtureBuilder;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FixtureGenerator<String> fixtureGenerator = new FixtureGenerator<>();
        List<String> teams = new LinkedList<>();
        /*
        - Galatasaray
        - Bursaspor
        - Fenerbahçe
        - Beşiktaş
        - Başakşehir
        - Bursaspor
        */
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Bursaspor");
//        teams.add("Başakşehir");
        int numberOfTeams = teams.size();
        boolean ghost = false;
        if (numberOfTeams % 2 != 0) {
            numberOfTeams++;
            ghost = true;
            teams.add("bay");
        }
        List<List<Fixture<String>>> rounds = fixtureGenerator.getFixtures(teams, true);
        for(int i=0; i<rounds.size(); i++){
            System.out.println("Round " + (i+1));
            List<Fixture<String>> round = rounds.get(i);
            for(Fixture<String> fixture: round){
                System.out.println(fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
            }
            System.out.println("**************");
        }





























        /*List<League> teams = new ArrayList<>();

        //Çift takım senaryosu

        teams.add(new League("Galatasaray"));
        teams.add(new League("Bursaspor"));
        teams.add(new League("Fenerbahçe"));
        teams.add(new League("Beşiktaş"));
        teams.add(new League("Başakşehir"));
        teams.add(new League("Bursaspor"));

        System.out.println(teams.size());
        int randNum = (int) (Math.random()*(teams.size()-1));
        System.out.println(randNum);


//        List<League> round = teams.subList(Math.random(0,size+1),5);

        List<League> teams2 = new ArrayList<>();

        //Tek takım senaryosu

        teams2.add(new League("Galatasaray"));
        teams2.add(new League("Bursaspor"));
        teams2.add(new League("Fenerbahçe"));
        teams2.add(new League("Beşiktaş"));
        teams2.add(new League("Başakşehir"));
        teams2.add(new League("Bursaspor"));
        teams2.add(new League("Boluspor"));*/

    }
}
