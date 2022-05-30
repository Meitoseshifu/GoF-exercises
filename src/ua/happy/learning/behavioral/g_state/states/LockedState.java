package ua.happy.learning.behavioral.g_state.states;

import ua.happy.learning.behavioral.g_state.ui.Player;

public class LockedState extends State {
    LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        return null;
    }

    @Override
    public String onPlay() {
        return null;
    }

    @Override
    public String onNext() {
        return null;
    }

    @Override
    public String onPrevious() {
        return null;
    }
}
