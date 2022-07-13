package state;

import context.Phone;

public class LockedState extends State {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return "[NO ACTION]";
    }

    @Override
    public String onOffOn() {
        phone.setState(new UnlockedState(phone));
        return "Screen unlocked";
    }
}
