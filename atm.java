import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int balance=5000,deposite,widraw;
        while (true) {
            System.out.println("chose 1 for deposite");
            System.out.println("chose 2 for widraw");
            System.out.println("chose 3 for cheack balace");
            System.out.println("chose 4 for exit");
             System.out.println("choise any number which you want perform:-");
            int chose=s1.nextInt();


            switch (chose) {
                case 1:
                      System.out.println("enter amount you want deposite");
                      deposite=s1.nextInt();

                      balance=balance +deposite;
                      System.out.println("your update amount is:-"+balance);
                      break;

                case 2:
                System.out.println("enter amount you want widraw:-");
                widraw=s1.nextInt();
                if (balance >= widraw) {
                    balance=balance-widraw;
                    System.out.println("your update amount is:-"+balance);  
                }
                else{
                    System.out.println("insuficent amount");
                }
                break;

                case 3:
                System.out.println("your available balance is"+balance);
                System.out.println();
                break;

                case 4:
                System.exit(chose);
                break;

            }
        }
        
    }
    
}
