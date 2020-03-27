package test.state.states;

import test.state.Context;
import test.state.StatEnum;
import test.state.State;

/**
 * ���ܳ齱
 */
public class NoLottery implements State {


    @Override
    public void deductionScore(Context cur) {
        //�۳�����
        if(cur.score>=50){
            cur.score -= 50;
            cur.setCurState(StatEnum.readyToLottery.getCur());
            System.out.println("���ֿ۳��ɹ�����ǰ���[{"+cur.score+"}]");
        }else{
            System.out.println("���ֲ��㣬��ǰ���[{"+cur.score+"}]");
        }

    }

    @Override
    public void lotteryDra(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]���ܳ齱");

    }

    @Override
    public void receivePrice(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]�����콱");
    }


    @Override
    public String toString() {
        return "׼���ۻ���";
    }
}
