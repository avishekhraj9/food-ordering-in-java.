
import java.util.*;
public class Main {

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose;
    public static int quantity=1;
    public static double total=0,pay;



    public static void menu(){
        System.out.println("\t\t\t\t+===================================+");
        System.out.println("\t\t\t\t------------LPU KA DHABA-------------");
        System.out.println("\t\t\t\t----------------MENU-----------------");
        System.out.println("\t\t\t\t   1. SAMOSA               RUPEES 15.00");
        System.out.println("\t\t\t\t   2. PATIES               RUPEES 40.00");
        System.out.println("\t\t\t\t   3. KACHORI              RUPEES 35.00");
        System.out.println("\t\t\t\t   4. CANCEL                         ");
        System.out.println("\t\t\t\t+====================================+");
    }

    public static void order(){
        int samosa_stock =100;
        System.out.println("Press 1 to SAMOSA , Press 2 to PATIES , Press 3 to KACHORI and Press 4 to Cancel");
        System.out.print("Press you want to buy? :");
        choose = input.nextInt();
        //conditions
        if(choose==1){
            System.out.println("You choose SAMOSA");
            System.out.print("How many SAMOSA you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*15);
            samosa_stock=samosa_stock-quantity;


            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            // samosa_stock=samosa_stock-again;
            if(again.equalsIgnoreCase("Y")){
                order();
            }else{
                System.out.println("Total price is " + total);
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank for ORDERING, ORDER WILL BE SERVRED SORTLY.");
                    System.out.println("SAMOSA STOCK LEFT"+samosa_stock);
                }
            }
        }else if(choose==2){
            System.out.println("You choose PATIES");
            System.out.print("How many PATIES you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*40);

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank for ORDERING, ORDER WILL BE SERVRED SORTLY.");
                }
            }
        }else if(choose==3){
            System.out.println("You choose KACHORI");
            System.out.print("How many KACHORI you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*30);

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order();
            }else{
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank for ORDERING, ORDER WILL BE SERVRED SORTLY.");
                }
            }
        }else if(choose==4){
            System.exit(0);

        }else{
            System.out.println("Choose 1 to 4 only!");
            order();
        }
    }
    public static void main(String[] args) {
        menu();
        order();
    }
}
