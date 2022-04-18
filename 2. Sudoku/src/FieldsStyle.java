import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class FieldsStyle {

    private JFormattedTextField[][] fields;
    private Font font = new Font("Courier", Font.BOLD,36);
    private MaskFormatter maskFormatter = null;
    private JPanel sudokuBoard;

    public FieldsStyle(JFormattedTextField[][] fields, JPanel sudokuBoard){
        this.fields = fields;
        this.sudokuBoard = sudokuBoard;
    }

    public void setFieldsStyle(JFormattedTextField[][] fields) {
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {

                fields[i][j] = new JFormattedTextField(5);

                try {
                    maskFormatter = new MaskFormatter("#");

                    fields[i][j] = new JFormattedTextField(maskFormatter);

                } catch (ParseException e) {
                    e.printStackTrace();
                }

                fields[i][j].setPreferredSize(new Dimension(50, 50));
                fields[i][j].setHorizontalAlignment(JFormattedTextField.CENTER);
                fields[i][j].setFont(font);

                sudokuBoard.add(fields[i][j]);
            }
        }

    }
}
