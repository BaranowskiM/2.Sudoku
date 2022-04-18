import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Borders {

    private JFormattedTextField[][] fields;

    Border casualBorder = BorderFactory.createMatteBorder(1, 1, 1,1, Color.BLACK);
    Border bottomBorder = BorderFactory.createMatteBorder(1, 1, 2,1, Color.BLACK);
    Border topBorder = BorderFactory.createMatteBorder(2, 1, 1,1, Color.BLACK);
    Border rightBorder = BorderFactory.createMatteBorder(1, 1, 1,2, Color.BLACK);
    Border leftBorder = BorderFactory.createMatteBorder(1, 2, 1,1, Color.BLACK);
    Border lefttopBorder = BorderFactory.createMatteBorder(2, 2, 1,1, Color.BLACK);
    Border leftbottomBorder = BorderFactory.createMatteBorder(1, 2, 2,1, Color.BLACK);
    Border rightbottomBorder = BorderFactory.createMatteBorder(1, 1, 2,2, Color.BLACK);
    Border righttopBorder = BorderFactory.createMatteBorder(2, 1, 1,2, Color.BLACK);

    public Borders(JFormattedTextField[][] fields){
        this.fields = fields;
    }

       public void borderSet(JFormattedTextField[][] fields) {
           for (int i = 0; i < fields.length; i++) {
               for (int j = 0; j < fields.length; j++) {
                   fields[i][j].setBorder(casualBorder);
               }
           }

           for (int j = 0; j < fields.length; j++) {
                fields[2][j].setBorder(bottomBorder);
                fields[3][j].setBorder(topBorder);
                fields[5][j].setBorder(bottomBorder);
                fields[6][j].setBorder(topBorder);

                fields[j][2].setBorder(rightBorder);
                fields[j][3].setBorder(leftBorder);
                fields[j][5].setBorder(rightBorder);
                fields[j][6].setBorder(leftBorder);
           }

           for (int i = 2; i < fields.length - 1; i += 3) {
                for (int j = 2; j < fields.length - 1; j += 3) {

                    fields[i][j].setBorder(rightbottomBorder);
                    fields[i][j + 1].setBorder(leftbottomBorder);
                    fields[i + 1][j].setBorder(righttopBorder);
                    fields[i + 1][j + 1].setBorder(lefttopBorder);
                }
           }

       }
}
