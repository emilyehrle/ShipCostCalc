import java.util.Scanner;

public class ShipCostCalc
{
    public static void main(String[ ] args){


        //   main ()
        //      num TAX_AMOUNT = .02
        //      num itemPrice = 0
        //      num shippingCost = 0
        //       num totalPrice = 0
        //       output “Input price of item: “
        //       input itemPrice
        //       if itemPrice >= 100 then
        //          totalPrice = itemPrice
        //          output “Your total price is $“ + totalPrice + and your shipping is free!”
        //      else
        //         shippingCost = itemPrice * TAX_AMOUNT
        //         totalPrice = itemPrice + shippingCost
        //         output “Your total price is $“ + totalPrice + “including the $“ + shippingCost + “shipping!”
        //      end if
        //    return
        //end class

        Scanner in = new Scanner(System.in); //input scanner

        double itemPrice = 0; // define variables
        double shippingCost = 0;
        double TAX_RATE = 0.02;
        double totalPrice = 0;

        System.out.println("Enter the price of the item: "); //prompt user
        itemPrice = in.nextDouble();

        if (itemPrice >= 100) //set conditions (if true)
        {
            totalPrice = itemPrice;
            System.out.println("You get free shipping!");
            System.out.println("Your total price is: $" + totalPrice);
        }
        else // (if false)
        {
            shippingCost = TAX_RATE * itemPrice;
            totalPrice = itemPrice + shippingCost;
            System.out.println("Your shipping cost is: $" + shippingCost);
            System.out.println("Your total price is: $" + totalPrice);
        }
        in.close();
    }
}