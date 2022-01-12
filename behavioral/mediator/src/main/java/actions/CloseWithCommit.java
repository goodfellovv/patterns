package actions;

import mediator.Mediator;

public class CloseWithCommit implements Action {
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void perform() {
        mediator.save();
        mediator.close();
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
