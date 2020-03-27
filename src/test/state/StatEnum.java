package test.state;

import test.state.states.NoLottery;
import test.state.states.NoPrize;
import test.state.states.ReceiveLottery;
import test.state.states.SureLottery;

public enum StatEnum {

    redayToReductionScore(new NoLottery()),
    readyToLottery(new SureLottery()),
    receivePrize(new ReceiveLottery()),
    NoPrize(new NoPrize());


    private State cur;

    StatEnum(State cur) {
        this.cur = cur;
    }

    public State getCur() {
        return cur;
    }

    public void setCur(State cur) {
        this.cur = cur;
    }
}
