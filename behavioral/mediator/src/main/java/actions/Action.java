package actions;

import mediator.Mediator;

public interface Action {
    void setMediator(Mediator mediator);

    void perform();

    String getName();
}
