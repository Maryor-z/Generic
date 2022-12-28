package com.maryor;

public class Main {
    public static void main(String[] args) {
        FootballPlayer messi = new FootballPlayer("Messi");
        BaseballPlayer arnold = new BaseballPlayer("Arnold");
        Handball best = new Handball("Best");

        Team<FootballPlayer> ifeRaptors = new Team<>("Ife Raptors");
        ifeRaptors.addPlayer(messi);
//        ifeRaptors.addPlayer(arnold);
//        ifeRaptors.addPlayer(best);

        System.out.println(ifeRaptors.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago cubs");
        baseballTeam.addPlayer(arnold);

        Team<Handball> brokenTeam = new Team<>("This wont work");
        brokenTeam.addPlayer(best);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(ifeRaptors, 3, 8);

        ifeRaptors.matchResult(fremantle, 2,1);
        ifeRaptors.matchResult(melbourne, 1, 1);

    }
}
