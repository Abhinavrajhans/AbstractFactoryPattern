package observerPattern.CricBuzz.problematic;

public class ICCApiService {

    private int runs;
    private int wickets;
    private int overs;

    ICCApiService(int runs, int wickets, int overs){
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public int getOvers() {
        return overs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }


    public void updateScore(int runs, int wickets, int overs){
        // will be making an api call to get the data from icc.
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

}
