package minipoject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int menu1;
        float total;
        int count;
        char donate;
        int donation;
        float donationAmt;
        double priceList[] = {3.99,4.49,4.99,7.98,8.98,9.98};
        String ItemsList[] = {"Orange (s)","Apple (s)", "Mango (s)","Orange (e)","Apple (e)", "Mango (e)"};
        List<Integer> itemsList = new ArrayList<Integer>();
        List<Integer> q_items = new ArrayList<Integer>();
        System.out.println("Hello What is your name?");
        name = scanner.nextLine();

        System.out.printf("Hey %s! How are you doing today\n",name);
        scanner.nextLine();

        System.out.printf("That's great to hear %s!\nLooks like you want to chill out with some ice creams %s, and you are at the right place!!!\n",name,name);
        do {

            System.out.printf("So %s, What would you like today?\n1.Scoops\n2.Exquisite\n",name);
            menu1 = scanner.nextInt();

            switch(menu1) {
                case 1:
                {
                    System.out.printf("Ok %s, how many scoops of ice-cream do you want?\n",name);
                    count = scanner.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.println("List of Scoops:\n1.Orange \t 3.99\n2.Apple \t 4.49\n3.Mango \t 4.99\n");
                        System.out.printf("Enter icecream %d of %d\n",i+1,count);
                        itemsList.add(scanner.nextInt()-1);
                        System.out.printf("\nWow, %s that's a great selection!!!, %s\nHow many Scoops of this flavour do you need?\n",ItemsList[itemsList.get(i)],name);
                        q_items.add(scanner.nextInt());
                    }
                    break;
                }
                case 2:
                {
                    System.out.printf("Ok %s, how many Exquisite of ice-cream do you want?\n",name);
                    count = scanner.nextInt();
                    System.out.println("List of Exquisite:\n1.Orange \t 7.98\n2.Apple \t 8.98\n3.Mango \t 9.98\n");
                    for (int i = 0; i < count; i++) {
                        System.out.printf("Enter icecream %d of %d\n",i+1,count);
                        itemsList.add(scanner.nextInt()+2);
                        System.out.printf("\nWow, %s that's a great selection!!!, %s\nHow many Exquisite of this flavour do you need?\n",ItemsList[itemsList.get(itemsList.size()-1)],name);
                        q_items.add(scanner.nextInt());
                    }

                    break;
                }
                default: System.out.println("I dont' understand???");
            }
            for(int i=0;i<75;i++) {
                System.out.print("-");
            }
            System.out.println("-");
            total =0;
            System.out.printf("S.No\tMenu Item\t\tprice\t\tqty\tpayable\n");
            for (int i=0;i<itemsList.size();i++) {
                System.out.printf("%d\t%s  \t\t%f\t%d\t  %f\n",i+1,ItemsList[itemsList.get(i)],priceList[itemsList.get(i)],q_items.get(i),q_items.get(i)*priceList[itemsList.get(i)]);
                total+= q_items.get(i)*priceList[itemsList.get(i)];
            }
            for(int i=0;i<75;i++) {
                System.out.print("-");
            }
            System.out.println("-");
            System.out.printf("Your Total is : \t\t\t\t\t %f\n",total);
            for(int i=0;i<75;i++) {
                System.out.print("-");
            }
            System.out.println("-");

            System.out.println("Do you want More?Yes(1)/No(0)");
            menu1 = scanner.nextInt();
        }while(menu1==1);
        System.out.printf("Thanks %s, Do you want to donate?(Y/N)\n",name);
        donate = Character.toLowerCase(scanner.next().charAt(0));
        switch (donate){
            case 'y':
                System.out.printf("How much do you want to donate?\nRound to nearest whole number (1) or other amount(2)?");
                donation = scanner.nextInt();
                switch (donation){
                    case 1:
                        System.out.printf("You are donating %f amount to charity\n",Math.ceil(total)-total); total = (float) Math.ceil(total); break;
                    case 2:
                        System.out.println("How much do you want to donate?");
                        donationAmt = scanner.nextFloat();
                        total = total+donationAmt;
                    default:System.out.println("Invalid option");
                }
                break;
            case 'n': System.out.println("That's fine"); break;
        }
        System.out.printf("Hi %s, Your final Total after donation: %f\n",name,total);
        System.out.println("Thanks for the visit!!! See You again!!!\n");


    }

}

/**
 Hello What is your name?
 Edwin
 Hey Edwin! How are you doing today
 Doing Fine
 What would you like today?
 1.Scoops
 2.Exquisite

 1
 How many Scoops do you want?
 2
 List of Scoops:
 1.Orange 	 3.99
 2.Apple 	 4.49
 3.Mango 	 4.99

 Enter icecream 1 of 2
 1
 How many Scoops of this flavour do you need?
 2
 List of Scoops:
 1.Orange 	 3.99
 2.Apple 	 4.49
 3.Mango 	 4.99

 Enter icecream 2 of 2
 2
 How many Scoops of this flavour do you need?
 1
 ----------------------------------------------------------------------------
 S.No	Menu Item		price		qty	payable
 1	Orange (s)  		3.990000	2	  7.980000
 2	Apple (s)  		4.490000	1	  4.490000
 ----------------------------------------------------------------------------
 Your Total is : 					 12.470000
 ----------------------------------------------------------------------------
 Do you want More?Yes(1)/No(0)
 1
 What would you like today?
 1.Scoops
 2.Exquisite

 2
 How many Exquisite do you want?
 1
 List of Exquisite:
 1.Orange 	 7.98
 2.Apple 	 8.98
 3.Mango 	 9.98

 Enter icecream 1 of 1
 3
 How many Exquisite of this flavour do you need?
 2
 ----------------------------------------------------------------------------
 S.No	Menu Item		price		qty	payable
 1	Orange (s)  		3.990000	2	  7.980000
 2	Apple (s)  		4.490000	1	  4.490000
 3	Mango (e)  		9.980000	2	  19.960000
 ----------------------------------------------------------------------------
 Your Total is : 					 32.430000
 ----------------------------------------------------------------------------
 Do you want More?Yes(1)/No(0)
 1
 What would you like today?
 1.Scoops
 2.Exquisite

 2
 How many Exquisite do you want?
 2
 List of Exquisite:
 1.Orange 	 7.98
 2.Apple 	 8.98
 3.Mango 	 9.98

 Enter icecream 1 of 2
 2
 How many Exquisite of this flavour do you need?
 1
 Enter icecream 2 of 2
 3
 How many Exquisite of this flavour do you need?
 1
 ----------------------------------------------------------------------------
 S.No	Menu Item		price		qty	payable
 1	Orange (s)  		3.990000	2	  7.980000
 2	Apple (s)  		4.490000	1	  4.490000
 3	Mango (e)  		9.980000	2	  19.960000
 4	Apple (e)  		8.980000	1	  8.980000
 5	Mango (e)  		9.980000	1	  9.980000
 ----------------------------------------------------------------------------
 Your Total is : 					 51.389999
 ----------------------------------------------------------------------------
 Do you want More?Yes(1)/No(0)
 0
 Thanks for the visit!!! See You again


 "C:\Program Files\Amazon Corretto\jdk17.0.2_8\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=53534:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\edwin\eclipse-workspace\SNVA Projects\bin" edwin_lingson.MiniProject
 Hello What is your name?
 Edwin
 Hey Edwin! How are you doing today
 Going Good
 That's great to hear Edwin!
 Looks like you want to chill out with some ice creams Edwin, and you are at the right place!!!
 So Edwin, What would you like today?
 1.Scoops
 2.Exquisite
 1
 Ok Edwin, how many scoops of ice-cream do you want?
 1
 List of Scoops:
 1.Orange 	 3.99
 2.Apple 	 4.49
 3.Mango 	 4.99

 Enter icecream 1 of 1
 2

 Wow, Apple (s) that's a great selection!!!, Edwin
 How many Scoops of this flavour do you need?
 2
 ----------------------------------------------------------------------------
 S.No	Menu Item		price		qty	payable
 1	Apple (s)  		4.490000	2	  8.980000
 ----------------------------------------------------------------------------
 Your Total is : 					 8.980000
 ----------------------------------------------------------------------------
 Do you want More?Yes(1)/No(0)
 1
 So Edwin, What would you like today?
 1.Scoops
 2.Exquisite
 2
 Ok Edwin, how many Exquisite of ice-cream do you want?
 1
 List of Exquisite:
 1.Orange 	 7.98
 2.Apple 	 8.98
 3.Mango 	 9.98

 Enter icecream 1 of 1
 3

 Wow, Mango (e) that's a great selection!!!, Edwin
 How many Exquisite of this flavour do you need?
 2
 ----------------------------------------------------------------------------
 S.No	Menu Item		price		qty	payable
 1	Apple (s)  		4.490000	2	  8.980000
 2	Mango (e)  		9.980000	2	  19.960000
 ----------------------------------------------------------------------------
 Your Total is : 					 28.939999
 ----------------------------------------------------------------------------
 Do you want More?Yes(1)/No(0)
 0
 Thanks Edwin, Do you want to donate?(Y/N)
 Y
 How much do you want to donate?
 Round to nearest whole number (1) or other amount(2)?1
 You are donating 0.060001 amount to charity
 Hi Edwin, Your final Total after donation: 29.000000
 Thanks for the visit!!! See You again!!!


 Process finished with exit code 0

 */
