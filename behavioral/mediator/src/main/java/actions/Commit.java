package actions;

import mediator.Mediator;

public class Commit implements Action {
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void perform() {
        mediator.save();
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

}
