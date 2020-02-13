package CS_202.W2.ZybookProjects;

public class Team {
    // TODO: Declare private fields - teamName, teamWins, teamLosses
    private String teamName;
    private int teamWins, teamLosses;

    // TODO: Define mutator methods -
    //       setTeamName(), setTeamWins(), setTeamLosses()
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public void setTeamWins(int teamWins) { this.teamWins = teamWins; }

    public void setTeamLosses(int teamLosses) { this.teamLosses = teamLosses; }

    // TODO: Define accessor methods -
    //       getTeamName(), getTeamWins(), getTeamLosses()
    public String getTeamName() { return teamName; }

    public int getTeamWins() { return teamWins; }

    public int getTeamLosses() { return teamLosses; }
    // TODO: Define getWinPercentage()
    public double getWinPercentage() {
        return (double)teamWins / (teamLosses + teamWins);
    }
}

