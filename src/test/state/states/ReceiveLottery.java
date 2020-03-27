package test.state.states;

import test.state.Context;
import test.state.StatEnum;
import test.state.State;

public class ReceiveLottery implements State {
    @Override
    public void deductionScore(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能扣积分");
    }

    @Override
    public void lotteryDra(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能抽奖");
    }

    @Override
    public void receivePrice(Context e) {
        if(e.prizeNum>0){
            System.out.println("领取奖品，当前奖品数[{"+e.prizeNum--+"}]");
            e.setCurState(StatEnum.redayToReductionScore.getCur());
        }else{
            System.out.println("当前奖品已经领取完！");
            e.setCurState(StatEnum.NoPrize.getCur());
        }
    }

    @Override
    public String toString() {
        return "发奖";
    }
}
