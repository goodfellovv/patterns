package context;

import state.OffState;
import state.State;

public class Phone {
    protected State state;

    public Phone() {
        this.state = new OffState(this);
    }

    public String lock(){
        return state.onOffOn();
    }

    public String home(){
        return state.onHome();
    }
    public String unlock(){
        return state.onOffOn();
    }
    public String turnOn(){
        return state.onOffOn();
    }
    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
