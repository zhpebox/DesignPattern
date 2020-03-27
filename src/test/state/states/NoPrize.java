package test.state.states;

import test.state.Context;
import test.state.State;

/**
 * 没有奖品
 */
public class NoPrize implements State {

    @Override
    public void deductionScore(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能扣除积分");
    }

    @Override
    public void lotteryDra(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能抽奖");
    }

    @Override
    public void receivePrice(Context e) {
        System.out.println("当前状态[{"+e.getCurState().toString()+"}]不能领奖奖");
    }

    @Override
    public String toString() {
        return "奖品领完";
    }
}
