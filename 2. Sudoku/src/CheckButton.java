import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CheckButton implements ActionListener {

    private JFormattedTextField[][] fields;
    private Border fieldBorder = BorderFactory.createMatteBorder(4, 4, 4,4, Color.RED);
    private Integer valueIJ;
    private Integer valueJI;
    private Integer valueIL;
    private Integer valueLI;
    private Integer valueLK;

    public CheckButton (JFormattedTextField[][] fields){

        this.fields = fields;

    }

@Override
    public void actionPerformed (ActionEvent actionEvent){

    Borders borders = new Borders(fields);
    borders.borderSet(fields);

    for (int i = 0; i < fields.length; i++){
        for (int j = 0; j < fields.length; j++) {
            if(fields[i][j].getValue() != null) {
                valueIJ = Integer.parseInt(fields[i][j].getText());
            } else {
                valueIJ = null;
            }

            if(fields[j][i].getValue() != null) {
                valueJI = Integer.parseInt(fields[j][i].getText());
            } else {
                valueJI = null;
            }

            for (int l = 0; l < fields.length; l++) {
                if(fields[i][l].getValue() != null) {
                    valueIL = Integer.parseInt(fields[i][l].getText());
                } else {
                    valueIL = null;
                }
                if ((valueIJ != null) && (valueIJ.equals(valueIL)) && !(j == l)) { // Sprawdzenie powtórek w poziomie
                    fields[i][j].setBorder(fieldBorder);
                    fields[i][l].setBorder(fieldBorder);
                }
            }
            for (int l = 0; l < fields.length; l++) {
                if(fields[l][i].getValue() != null) {
                    valueLI = Integer.parseInt(fields[l][i].getText());
                } else {
                    valueLI = null;
                }
                if ((valueJI != null) && (valueJI.equals(valueLI)) && !(j == l)) { // Sprawdzenie powtórek w pionie
                    fields[j][i].setBorder(fieldBorder);
                    fields[l][i].setBorder(fieldBorder);

                }

            }

            for(int l = 0; l < fields.length / 3; l++) {
                for (int k = 0; k < fields.length / 3; k++) {

                    if ((i < 3) && (j < 3)) {
                        if (fields[l][k].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l][k].getText());
                        } else {
                            valueLK = null;
                        }
                    } else if ((i < 3) && ((j >= 3) && (j < 6))) {
                        if (fields[l][k + 3].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l][k + 3].getText());
                        } else {
                            valueLK = null;
                        }
                    } else if ((i < 3) && (j >= 6)) {
                        if (fields[l][k + 6].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l][k + 6].getText());
                        } else {
                            valueLK = null;
                        }
                    } else if (((i >= 3) && (i < 6)) && (j < 3)) {
                        if (fields[l + 3][k].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l + 3][k].getText());
                        } else {
                            valueLK = null;
                        }
                    } else if ((i >= 6) && (j < 3)) {
                        if (fields[l + 6][k].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l + 6][k].getText());
                        } else {
                            valueLK = null;
                        }
                    } else if (((i >= 3) && (i < 6)) && ((j >= 3) && (j < 6))) {
                        if (fields[l + 3][k + 3].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l + 3][k + 3].getText());
                        } else {
                            valueLK = null;
                        }
                    } else if (((i >= 3) && (i < 6)) && (j >= 6)) {
                        if (fields[l + 3][k + 6].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l + 3][k + 6].getText());
                        } else {
                            valueLK = null;
                        }
                    } else if ((i >= 6) && ((j >= 3) && (j < 6))) {
                        if (fields[l + 6][k + 3].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l + 6][k + 3].getText());
                        } else {
                            valueLK = null;
                        }
                    } else if ((i >= 6) && (j >= 6)) {
                        if (fields[l + 6][k + 6].getValue() != null) {
                            valueLK = Integer.parseInt(fields[l + 6][k + 6].getText());
                        } else {
                            valueLK = null;
                        }
                    }


                    if ((i < 3) && (j < 3)) { // Sprawdzenie powtórek w kwadracie lewym górnym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l) && (j == k)))) {
                            fields[i][j].setBorder(fieldBorder);
                            fields[l][k].setBorder(fieldBorder);
                        }
                    } else if ((i < 3) && ((j >= 3) && (j < 6))) {  // Sprawdzenie powtórek w kwadracie środkowym górnym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l) && (j == k + 3)))) {   //valueLK3
                            fields[i][j].setBorder(fieldBorder);
                            fields[l][k + 3].setBorder(fieldBorder);
                        }
                    } else if ((i < 3) && (j >= 6)) {  // Sprawdzenie powtórek w kwadracie prawym górnym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l) && (j == k + 6)))) {   //valueLK6
                            fields[i][j].setBorder(fieldBorder);
                            fields[l][k + 6].setBorder(fieldBorder);
                        }
                    } else if (((i >= 3) && (i < 6)) && (j < 3)) { // Sprawdzenie powtórek w kwadracie lewym środkowym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l + 3) && (j == k)))) {   //valueL3K
                            fields[i][j].setBorder(fieldBorder);
                            fields[l + 3][k].setBorder(fieldBorder);
                        }
                    } else if ((i >= 6) && (j < 3)) { // Sprawdzenie powtórek w kwadracie lewym dolnym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l + 6) && (j == k)))) {  //valueL6K
                            fields[i][j].setBorder(fieldBorder);
                            fields[l + 6][k].setBorder(fieldBorder);
                        }
                    } else if (((i >= 3) && (i < 6)) && ((j >= 3) && (j < 6))) {  // Sprawdzenie powtórek w kwadracie środkowym środkowym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l + 3) && (j == k + 3)))) {   //valueL3K3
                            fields[i][j].setBorder(fieldBorder);
                            fields[l + 3][k + 3].setBorder(fieldBorder);
                        }
                    } else if ((i >= 6) && ((j >= 3) && (j < 6))) {  // Sprawdzenie powtórek w kwadracie środkowym dolnym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l + 6) && (j == k + 3)))) {   //valueL6K3
                            fields[i][j].setBorder(fieldBorder);
                            fields[l + 6][k + 3].setBorder(fieldBorder);
                        }
                    } else if (((i >= 3) && (i < 6)) && (j >= 6)) {  // Sprawdzenie powtórek w kwadracie prawym środkowym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l + 3) && (j == k + 6)))) {   //valueL3K6
                            fields[i][j].setBorder(fieldBorder);
                            fields[l + 3][k + 6].setBorder(fieldBorder);
                        }
                    } else if ((i >= 6) && (j >= 6)) {  // Sprawdzenie powtórek w kwadracie prawym dolnym
                        if ((valueIJ != null) && (valueIJ.equals(valueLK)) && (!((i == l + 6) && (j == k + 6)))) {   //valueL6K6
                            fields[i][j].setBorder(fieldBorder);
                            fields[l + 6][k + 6].setBorder(fieldBorder);
                        }
                    }
                }
            }
            }
        }
    }

}
