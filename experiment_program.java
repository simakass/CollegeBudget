
import java.util.Scanner;
class experiment_program
{
    
    
    public static void main(String[] args)
    {
        int[] money;
        money = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the program! Please enter the expenses for every section of your budget: ");
        report(money);
    }
    public static int[] userInputCalculations(String[] someNames)
    {
        Scanner scan = new Scanner(System.in);
        int[] money;
        money = new int[10];
        for (int i=0; i<10; i++)
        {
            System.out.print("Enter the expenses for " + someNames[i] + " : $");
            money[i] = scan.nextInt();
        }
        System.out.println("-----------------------------------------");
        return money;
    }
    public static void report(int[] someMoney)
    {
        int[] maxMoney = {500, 150, 65, 50, 250, 30, 100, 150, 75, 50};
        int difference;
        String[] names = {"Housing", "Utilities", "Household Expenses", "Transportation", "Food", "Medical", "Insurance", "Entertainment", "Clothing", "Miscellaneous"};
        someMoney = userInputCalculations(names);
        for (int i=0; i<10; i++)
        {
            difference = someMoney[i] - maxMoney[i]; // what we spent minus the maximum amount
            if (difference > 0)
            {
                System.out.print("For " + names[i] + ", ");
                System.out.println("you are $" + difference + " over budget.");
            }
            else if (difference < 0 )
            {
                System.out.print("For " + names[i] + ", ");
                System.out.println("you are $" + (difference * -1) + " under budget.");
            }
            else if (difference == 0)
            {
                System.out.print("For " + names[i] + ", ");
                System.out.println("you hit the exact budget.");
            }
        }
    }
    
}
