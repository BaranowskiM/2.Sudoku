import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartButton implements ActionListener {

    private JFormattedTextField[][] fields;
    private Integer[][] newFields;
    private int index;

    public StartButton(JFormattedTextField[][] fields){
        this.fields = fields;
    }

    @Override
    public void actionPerformed (ActionEvent actionEvent){

        Borders borders = new Borders(fields);
        borders.borderSet(fields);

        SudokuFields sudokuFields = new SudokuFields(fields);
        sudokuFields.fillFieldsList();

        index = (int) (Math.random() * sudokuFields.fieldsListSize());
        newFields = sudokuFields.getFieldsListBoard(index);

        sudokuFields.setSudokuData(newFields);
    }
}
