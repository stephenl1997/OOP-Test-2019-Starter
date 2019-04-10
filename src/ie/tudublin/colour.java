package ie.tudublin;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

//imports don't appear to work

public class colour
{
    public void addColour(String string, String string2) {
        Table table = addColour("colours.csv", "header");


        for (TableRow row : table.rows()) {
            Object colour = new colour(row);
            ((Object) colour).add(colour);
        }
    }
}