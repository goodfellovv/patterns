package state;

import context.Phone;

public class UnlockedState extends State {
    public UnlockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return "Main screen";
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return "Screen locked";
    }
}