package converting;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double convertF;
        double celsiusEntry;
        GetStuff celsiusNum1 = new GetStuff();
        GetStuff fahrenNum1 = new GetStuff();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a trmperature in celsius >>> ");
        celsiusEntry = input.nextDouble();

        convertF = convertFahrenheit(celsiusEntry);
        celsiusNum1.setCelciusTemp(celsiusEntry);
        //fahrenNum1.setFahrenheitTemp(convertF);
        System.out.println("The temperature in fahrenheit is " + convertF);

        System.out.println(celsiusNum1.getCelsiusTemp() + " celsius temperature.");
        //System.out.println(fahrenNum1.getFahrenheitTemp()+ " fahrenheit temperature")
    }

    public static double convertFahrenheit(double c) {
        double convertF;
        convertF = (c * 9/5) + 32;
        return convertF;
    }
}


