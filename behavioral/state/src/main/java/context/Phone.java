package context;

import state.OffState;
import state.State;

public class Phone {
    protected State state;

    public Phone() {
        this.state = new OffState(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String lock(){
        return "Locking phone and turn off the screen";
    }
    public String home(){
        return "Going to home-screen";
    }
    public String unlock(){
        return "Unlocking the phone to home screen";
    }
    public String turnOn(){
        return "Turning screen on, device still locked";
    }
}
