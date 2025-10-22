package observerPattern.CricBuzz.problematic;

public class Cricbuzz {

    private int runs;
    private int wickets;
    private int overs;
    private ICCApiService iccApiService; // this violates DIP


    public Cricbuzz(){
        this.iccApiService = new ICCApiService(0,0,0);
        this.runs = iccApiService.getRuns();
        this.wickets = iccApiService.getWickets();
        this.overs = iccApiService.getOvers();
    }


    public void updateScore(int runs, int wickets, int overs){
      while(true)
      {
        iccApiService.updateScore(runs, wickets, overs);
        // we can write the logic to check if the runs or wickets or oveers have changed , then we can update the score.
        if(this.overs != iccApiService.getOvers()){
            this.runs = iccApiService.getRuns();
            this.wickets = iccApiService.getWickets();
            this.overs = iccApiService.getOvers();
            System.out.println(runs + "/" + wickets + " in " + overs + " overs");
        }
      }
    }
    
}
