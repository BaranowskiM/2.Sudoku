
import javax.swing.*;
import java.util.ArrayList;

public class SudokuFields {
    private JFormattedTextField[][] fields ;

    private Integer[][] fields1 = {{null, null, 1, 8, null, 5, 2, null, null}, {null, 4, 5, null, 2, null, null, 1, null}, {2, null, 3, null, null, null, 7, 5, 8},
            {7, null, null, 5, null, 2, null, null, 4}, {null, 6, null, null, 8, null, null, 2, null}, {9, null, null, 4, null, 6, null, null, 1},
            {3, 1, 9, null, null, null, 4, null, 6}, {null, 8, null, null, 4, null, 3, 9, null}, {null, null, 6, 3, null, 7, 1, null, null}};

    private Integer[][] fields2 = {{null, null, null, null, null, null, 9, 5, 2}, {5, 6, 2, null, null, 8, null, 7, null}, {null, null, null, null, null, 1, null, 4, null},
            {null, null, null, 9, null, null, 3, 8, null}, {6, null, 4, 5, null, null, 7, null, null}, {null, 8, 9, 6, 3, 7, null, 2, null},
            {3, null, null, null, 4, null, null, 6, 5}, {2, 9, 8, null, null, null, null, null, 1}, {null, null, null, null, 2, 3, null, null, 7}};

    private Integer[][] fields3 = {{4, 2, 9, null, null, 3, 8, null, 5}, {3, null, null, null, 9, null, 1, null, 4}, {null, 8, null, null, 2, null, null, null, 3},
            {null, null, 8, null, 5, null, null, 4, null}, {null, null, 5, 2, null, 1, null, 6, null}, {null, null, 7, null, null, 8, null, null, 1},
            {null, null, null, 6, 3, null, null, null, null}, {8, 6, null, null, null, null, 5, null, null}, {5, null, 3, null, null, null, 7, 1, null}};

    private Integer[][] fields1solved = {{6, 7, 1, 8, 3, 5, 2, 4, 9}, {8, 4, 5, 7, 2, 9, 6, 1, 3}, {2, 9, 3, 1, 6, 4, 7, 5, 8},
            {7, 3, 8, 5, 1, 2, 9, 6, 4}, {1, 6, 4, 9, 8, 3, 5, 2, 7}, {9, 5, 2, 4, 7, 6, 8, 3, 1},
            {3, 1, 9, 2, 5, 8, 4, 7, 6}, {5, 8, 7, 6, 4, 1, 3, 9, 2}, {4, 2, 6, 3, 9, 7, 1, 8, null}};

    private ArrayList<Integer[][]> fieldsList= new ArrayList<>();

    public SudokuFields(JFormattedTextField[][] fields){
        this.fields = fields;
    }

    public void fillFieldsList() {
        fieldsList.add(fields1);
        fieldsList.add(fields2);
        fieldsList.add(fields3);
        fieldsList.add(fields1solved);
    }

    public int fieldsListSize(){
        return fieldsList.size();
    }

    public Integer[][] getFieldsListBoard(int index){
        return fieldsList.get(index);
    }

   public void setSudokuData(Integer[][] fieldsData) {
       for (int i = 0; i < 9; i++) {
           for (int j = 0; j < 9; j++) {
               fields[i][j].setEnabled(true);
               fields[i][j].setValue(null);
               fields[i][j].setValue(fieldsData[i][j]);
               if(fieldsData[i][j] != null) {
                   fields[i][j].setEnabled(false);
               }
           }
       }

   }


}
