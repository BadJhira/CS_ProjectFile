package CS_202.W2.ZybookProjects;

import java.util.Scanner;

public class WinningTeam {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Team team = new Team();

        String name = scnr.next();
        int wins = scnr.nextInt();
        int losses = scnr.nextInt();

        team.setTeamName(name);
        team.setTeamWins(wins);
        team.setTeamLosses(losses);

        if (team.getWinPercentage() >= 0.5) {
            System.out.println("Congratulations, Team " + team.getTeamName() +
                    " has a winning average!");
        }
        else {
            System.out.println("Team " + team.getTeamName() +
                    " has a losing average.");
        }
    }
}

