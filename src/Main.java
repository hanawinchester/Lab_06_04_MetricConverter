import java.util.Scanner;
public class Main
{
    public static void main(String[] args)

    {
        double meters;
        double miles;
        double feet;
        double inches;
        String trash;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a measurement in meters: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
            miles = meters * .000621371;
            feet = meters * 3.28084;
            inches = feet * 12;
            String formattedMiles = String.format("%.10f", miles);
            String formattedFeet = String.format("%.10f", feet);
            String formattedInches = String.format("%.10f", inches);
            System.out.println(meters + " meter(s) is the same as " + formattedMiles + " miles, " + formattedFeet + " feet, or " + formattedInches + " inches.");
        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for measurement in meters. You entered: " + trash);
        }
    }
}