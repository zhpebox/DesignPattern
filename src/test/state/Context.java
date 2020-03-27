package test.state;

public class Context {
    private State curState;
    public int score;
    public int prizeNum;




    public Context( int score,int prizeNum) {
        this.curState = StatEnum.redayToReductionScore.getCur();
        this.score = score;
        this.prizeNum = prizeNum;
    }


    void deductionScore(){
        curState.deductionScore(this);
    }
    void lotteryDra(){
        curState.lotteryDra(this);
    }
    void receivePrice(){
        curState.receivePrice(this);
    }



    public void setCurState(State curState) {
        this.curState = curState;
    }
    public State getCurState() {
        return curState;
    }
}
