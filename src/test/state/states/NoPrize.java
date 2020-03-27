package test.state.states;

import test.state.Context;
import test.state.State;

/**
 * û�н�Ʒ
 */
public class NoPrize implements State {

    @Override
    public void deductionScore(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]���ܿ۳�����");
    }

    @Override
    public void lotteryDra(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]���ܳ齱");
    }

    @Override
    public void receivePrice(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]�����콱��");
    }

    @Override
    public String toString() {
        return "��Ʒ����";
    }
}
