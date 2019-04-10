package ie.tudublin;

import java.util.Scanner; 

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public void insert()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a 3 digit number ");
        value = reader.nextInt(); 
        reader.close();

    }


    hundreds = (value / 100);
    tens = (value - (hundreds * 100)) / 10;
    ones = value - ((hundreds * 100)  + (tens * 10));
    print(hundreds + ",");
    print(tens + ",");
    println(ones);
}