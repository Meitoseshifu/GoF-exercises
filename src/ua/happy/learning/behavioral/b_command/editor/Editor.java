package ua.happy.learning.behavioral.b_command.editor;

import ua.happy.learning.behavioral.b_command.commands.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private final CommandHistory history = new CommandHistory();

    public void init() {
        JFrame jFrame = new JFrame("Text editor (type & use buttons, Luke!)");
        JPanel jPanelContent = new JPanel();
        jFrame.setContentPane(jPanelContent);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanelContent.setLayout(new BoxLayout(jPanelContent, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        jPanelContent.add(textField);

        JPanel jPanelButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");

        Editor editor = this;

        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(editor)));
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(editor)));
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(editor)));
        ctrlZ.addActionListener(e -> undo());

        jPanelButtons.add(ctrlC);
        jPanelButtons.add(ctrlX);
        jPanelButtons.add(ctrlV);
        jPanelButtons.add(ctrlZ);

        jPanelContent.add(jPanelButtons);

        jFrame.setSize(450, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) {
            return;
        }

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }

    }

}
