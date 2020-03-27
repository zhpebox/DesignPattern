package test.state.states;


import test.state.Context;
import test.state.StatEnum;
import test.state.State;

/**
 * ׼���齱
 */
public class SureLottery implements State {
    @Override
    public void deductionScore(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]���ܿ۳�����");
    }

    @Override
    public void lotteryDra(Context e) {
        int r = (int)(Math.random()*10);
        if(r<5){
            //�н�
            System.out.println("�н�");
            e.setCurState(StatEnum.receivePrize.getCur());
        }else{
            System.out.println("���ź���û�н���");
            e.setCurState(StatEnum.redayToReductionScore.getCur());
        }
    }

    @Override
    public void receivePrice(Context e) {
        System.out.println("��ǰ״̬[{"+e.getCurState().toString()+"}]�����콱");
    }

    @Override
    public String toString() {
        return "׼���齱";
    }
}
