package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.CoffeeTemplate;
import lab.assignment.afterrefactoring.CapuccinoCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new MochaCoffee();
        starbuzz.prepareMochaCoffee();

        System.out.println("********************");

        coffeeType = new CapuccinoCoffee();
        starbuzz.prepareCapuccinoCoffee();

        System.out.println("********************");

        coffeeType = new AmericanoCoffee();
        starbuzz.prepareAmericanoCoffee();

    }

}
