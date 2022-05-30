package ua.happy.learning.behavioral.g_state.ui;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Player player;
    private static JTextField textField = new JTextField();

    public UI(Player player) {
        this.player = player;
    }

    public void init() {
        JFrame jFrame = new JFrame("Test player");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contextJPanel = new JPanel();
        contextJPanel.setLayout(new BoxLayout(contextJPanel, BoxLayout.Y_AXIS));
        jFrame.getContentPane().add(contextJPanel);
        JPanel buttonsJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contextJPanel.add(textField);
        contextJPanel.add(buttonsJPanel);

        // Context delegates handling user's input to a state object. Naturally,
        // the outcome will depend on what state is currently active, since all
        // states can handle the input differently.

        JButton playJButton = new JButton("Play");
        playJButton.addActionListener(al -> textField.setText(player.getState().onPlay()));
        JButton stopJButton = new JButton("Stop");
        stopJButton.addActionListener(al -> textField.setText(player.getState().onLock()));
        JButton nextJButton = new JButton("Next");
        nextJButton.addActionListener(al -> textField.setText(player.getState().onNext()));
        JButton prevJButton = new JButton("Prev");
        prevJButton.addActionListener(ai -> textField.setText(player.getState().onPrevious()));
        jFrame.setVisible(true);
        jFrame.setSize(300, 100);
        buttonsJPanel.add(playJButton);
        buttonsJPanel.add(stopJButton);
        buttonsJPanel.add(nextJButton);
        buttonsJPanel.add(prevJButton);
    }
}
