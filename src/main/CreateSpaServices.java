package main;

import java.util.Scanner;

public class CreateSpaServices {

    public static void main(String[] args)
    {
        String service;
        double price;
        String getString = null;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner input = new Scanner(System.in);

        pl("Enter service >>");
        service = input.nextLine();
        pl("Enter price >>");
        price = input.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        input.nextLine();
        pl("Enter service >>");
        service = input.nextLine();
        pl("Enter price >>");
        price = input.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        pl("First service detail");
        pl(firstService.getServiceDescription() + " $" + secondService.getPrice());

        System.out.println("Second service details; ");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    }
    public static void pl(String getString)
    {
        System.out.println(getString);
    }
}
