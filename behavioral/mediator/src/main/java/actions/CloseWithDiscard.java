package actions;

import mediator.Mediator;

public class CloseWithDiscard implements Action {
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void perform() {
        mediator.discard();
        mediator.close();
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

}
