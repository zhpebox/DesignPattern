package test.state.states;

import test.state.Context;
import test.state.StatEnum;
import test.state.State;

/**
 * 不能抽奖
 */
public class NoLottery implements State {


    @Override
    public void deductionScore(Context cur) {
        //扣除积分
        if(cur.score>=50){
            cur.score -= 50;
            cur.setCurState(StatEnum.readyToLottery.getCur());
            System.out.println("积分扣除成功！当前余额[{"+cur.score+"}]");
        }else{
            System.out.println("积分不足，当前余额[{"+cur.score+"}]");
        }

    }

    @Override
    public void lotteryDra(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能抽奖");

    }

    @Override
    public void receivePrice(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能领奖");
    }


    @Override
    public String toString() {
        return "准备扣积分";
    }
}
