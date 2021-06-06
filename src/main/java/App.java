import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("#.##");
//input
        System.out.print("What is the order amount? ");
        double amount = sc.nextDouble();
        System.out.print("What is the state? ");
        String state = sc.next().toLowerCase();

//calculation

        double intRate = 5.5;
        double intAdj = (intRate * .01) * amount;
        double totalAdj = intAdj+amount;

        //userInput.equals("B")
        if(state.equals("wi")){

            System.out.println("The subtotal is $"+ df2.format(amount) +"\n" +"The tax is $" + df2.format(intRate) + "\n" + "The total is $" + df2.format(totalAdj));

        }
//output
        if(!state.equals("wi")){System.out.println("The total is $" + df2.format(amount));}
    }
}
