
import java.util.*;
public class Main {

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose;
    public static int quantity=1;
    public static double total=0,pay;

    public static int samosa_stock =100;
    public static int paties_stock = 100;
    public static int kachori_stock =100;
    public static String code ="10OFF";
    public static String Coupon_code;



    public static void menu_card(){
        System.out.println("\t\t\t\t+===================================+");
        System.out.println("\t\t\t\t------------LPU KA DHABA-------------");
        System.out.println("\t\t\t\t----------------MENU-----------------");
        System.out.println("\t\t\t\t   1. SAMOSA               RUPEES 15.00");
        System.out.println("\t\t\t\t   2. PATIES               RUPEES 40.00");
        System.out.println("\t\t\t\t   3. KACHORI              RUPEES 35.00");
        System.out.println("\t\t\t\t   4. CANCEL                         ");
        System.out.println("\t\t\t\t+====================================+");
    }

    public static void place_order(){


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
                place_order();
            }else{
                System.out.println("Total price is " + total);
                System.out.println("Enter the Code");
                Coupon_code=input.next();
                if (Coupon_code.equalsIgnoreCase(code))
                {
                    total =total-(0.1*total);
                }
                System.out.println("Amount after the discount "+total);


                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank for orderING, order WILL BE SERVRED SORTLY.");
                    System.out.println("SAMOSA STOCK LEFT "+samosa_stock);
                    System.out.println("PATIES STOCK LEFT "+paties_stock);
                    System.out.println("KACHORI STOCK LEFT "+kachori_stock);
                }
            }
        }else if(choose==2){
            System.out.println("You choose PATIES");
            System.out.print("How many PATIES you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*40);
            paties_stock= paties_stock-quantity;

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                place_order();
            }else{
                System.out.println("Total price is " + total);
                System.out.println("Enter the Code");
                Coupon_code=input.next();
                if (Coupon_code.equalsIgnoreCase(code))
                {
                    total =total-(0.1*total);
                }
                System.out.println("Amount after the discount "+total);
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank for orderING, order WILL BE SERVRED SORTLY.");
                    System.out.println("PATIES STOCK LEFT "+paties_stock);
                    System.out.println("SAMOSA STOCK LEFT "+samosa_stock);
                    System.out.println("KACHORI STOCK LEFT "+kachori_stock);

                }
            }
        }else if(choose==3){
            System.out.println("You choose KACHORI");
            System.out.print("How many KACHORI you want to Buy? :");
            quantity =input.nextInt();
            total = total +(quantity*30);
            kachori_stock=kachori_stock-quantity;

            System.out.println("You want to buy again? ");
            System.out.println("Press Y for Yes and N for N : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                place_order();
            }else{
                System.out.println("Total price is " + total);
                System.out.println("Enter the Code");
                Coupon_code=input.next();
                if (Coupon_code.equalsIgnoreCase(code))
                {
                    total =total-(0.1*total);
                }
                System.out.println("Amount after the discount "+total);
                System.out.println("Enter a payment ");
                pay = input.nextDouble();
                if(pay <=total){
                    System.out.println("Not enough payment");
                }else{
                    System.out.println("Total price is " + total);
                    total = pay-total;
                    System.out.println("The change is " + total);
                    System.out.println("Thank for orderING, order WILL BE SERVRED SORTLY.");
                    System.out.println("KACHORI STOCK LEFT "+kachori_stock);
                    System.out.println("SAMOSA STOCK LEFT "+samosa_stock);
                    System.out.println("PATIES STOCK LEFT "+paties_stock);
                }
            }
        }else if(choose==4){
            System.exit(0);

        }else{
            System.out.println("Choose 1 to 4 only!");
            place_order();
        }
    }
    public static void main(String[] args) {
        menu_card();
        place_order();
    }
}
