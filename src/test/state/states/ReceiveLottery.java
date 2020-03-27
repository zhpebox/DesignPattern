package test.state.states;

import test.state.Context;
import test.state.StatEnum;
import test.state.State;

public class ReceiveLottery implements State {
    @Override
    public void deductionScore(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]���ܿۻ���");
    }

    @Override
    public void lotteryDra(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]���ܳ齱");
    }

    @Override
    public void receivePrice(Context e) {
        if(e.prizeNum>0){
            System.out.println("��ȡ��Ʒ����ǰ��Ʒ��[{"+e.prizeNum--+"}]");
            e.setCurState(StatEnum.redayToReductionScore.getCur());
        }else{
            System.out.println("��ǰ��Ʒ�Ѿ���ȡ�꣡");
            e.setCurState(StatEnum.NoPrize.getCur());
        }
    }

    @Override
    public String toString() {
        return "����";
    }
}
