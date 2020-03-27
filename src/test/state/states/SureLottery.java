package test.state.states;


import test.state.Context;
import test.state.StatEnum;
import test.state.State;

/**
 * 准备抽奖
 */
public class SureLottery implements State {
    @Override
    public void deductionScore(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能扣除积分");
    }

    @Override
    public void lotteryDra(Context e) {
        int r = (int)(Math.random()*10);
        if(r<5){
            //中奖
            System.out.println("中奖");
            e.setCurState(StatEnum.receivePrize.getCur());
        }else{
            System.out.println("很遗憾！没中奖！");
            e.setCurState(StatEnum.redayToReductionScore.getCur());
        }
    }

    @Override
    public void receivePrice(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能领奖");
    }

    @Override
    public String toString() {
        return "准备抽奖";
    }
}
