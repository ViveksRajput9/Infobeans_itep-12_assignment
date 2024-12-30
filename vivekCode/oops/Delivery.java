package oops;

public class Delivery{
    long over;
    long ball;
    long runs;
    String batsman;
    String bowler;
    String nonStriker;
    
    Delivery(){
        this.over = 0;
        this.ball = 0;
        this.runs = 0;
        this.batsman="None";
        this.bowler = "None";
        this.nonStriker = "None";
    }

    Delivery(long over , long ball , long runs, String batsman , String bowler, String nonStriker){
        this.over = over;
        this.ball = ball;
        this.runs = runs;
        this.batsman = batsman;
        this.bowler = bowler;
        this.nonStriker = nonStriker;
    }

    public void setOver(long over){
        this.over = over;
    }

    public long getOver() {
        return over;
    }

    public void setBall(long ball) {
        this.ball = ball;
    }

    public long getBall() {
        return ball;
    }
    
    public void setRuns(long runs) {
        this.runs = runs;
    }

    public long getRuns() {
        return runs;
    }
    
    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public String getBowler() {
        return bowler;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    public static void main(String[] args) {
        Delivery scoreBoard= new Delivery(8,6,0,"badal","vivek","Umesh");
        long ball = scoreBoard.getBall();
        System.out.println(ball);
        scoreBoard.setBall(2);
        ball = scoreBoard.getBall();
        System.out.println(ball);
    }
}
