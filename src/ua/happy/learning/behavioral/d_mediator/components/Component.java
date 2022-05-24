package ua.happy.learning.behavioral.d_mediator.components;

import ua.happy.learning.behavioral.d_mediator.mediators.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
