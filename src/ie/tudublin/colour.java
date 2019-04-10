package ie.tudublin;

import javax.swing.text.TableView.TableRow;
import processing.data.table;

//imports don't appear to work

public class colour
{
    public void addColour(String string, String string2) {
        Table table = addColour("colours.csv", "header");


        for (TableRow row : table.rows()) {
            Object colour = new colour();
            ((Object) colour).add(colour);
        }
    }
}