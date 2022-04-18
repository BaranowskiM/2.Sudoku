import javax.swing.*;
import java.awt.*;

public class SudokuMain extends JFrame {
    private JFormattedTextField[][] fields = new JFormattedTextField[9][9];

    public SudokuMain() {
        JPanel backGround = new JPanel(new BorderLayout());
        JPanel sudokuBoard = new JPanel(new GridLayout(9,9));
        JPanel controlBoard = new JPanel(new FlowLayout());

        backGround.add(sudokuBoard, BorderLayout.CENTER);
        backGround.add(controlBoard, BorderLayout.PAGE_END);

        JButton start = new JButton("Nowa gra");
        JButton check = new JButton("Sprawdź");
        getContentPane().add(backGround);

        CheckButton checkButton = new CheckButton(fields);
        check.addActionListener(checkButton);
        StartButton startButton = new StartButton(fields);
        start.addActionListener(startButton);

        controlBoard.add(start);
        controlBoard.add(check);

        FieldsStyle fieldsStyle = new FieldsStyle(fields, sudokuBoard);
        fieldsStyle.setFieldsStyle(fields);

        Borders border = new Borders(fields);
        border.borderSet(fields);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater((SudokuMain::new));
    }

}
