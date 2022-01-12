import actions.*;
import mediator.Form;
import mediator.Mediator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mediator form = new Form();
        Action closeWithCommit = new CloseWithCommit();
        closeWithCommit.setMediator(form);
        Action closeWithDiscard = new CloseWithDiscard();
        closeWithDiscard.setMediator(form);
        Action commit = new Commit();
        commit.setMediator(form);
        Action discard = new Discard();
        discard.setMediator(form);

        List<Action> actions = Arrays.asList(closeWithCommit, closeWithDiscard, discard, commit);
        System.out.println("******** Perform actions ********\n");
        actions.forEach(action -> {
            System.out.println("Action: " + action.getName());
            action.perform();
            System.out.println();
        });
        System.out.println("******** Actions performed ********");
    }
}
