import java.util.HashMap;
import java.util.Map;

public class Main {

    protected static Map<String, String> accounts = new HashMap<String, String>();
    protected static Map<String, Integer> accountBalance = new HashMap<String, Integer>();
    protected static Map<String, String> transactionHistory = new HashMap<String, String>();

    public static void choiceMain(String accountName) {
        char ch;
        do{
        System.out.println("Please enter your choice");
        System.out.println("1. Withdrawl");
        System.out.println("2. Transfer");
        System.out.println("3. Deposit");
        System.out.println("4. Transaction History");
        System.out.println("5. Exit");

        int choice = Integer.parseInt(System.console().readLine());
        
        switch (choice) {
            case 1:
                Withdrawl w = new Withdrawl();
                w.withdrawl(accountName);
                break;
            case 2:
                Transfer t = new Transfer();
                t.transfer(accountName);
                break;
            case 3:
                Deposit d = new Deposit();
                d.deposit(accountName);
                break;
            case 4:
            TransactionHistory th = new TransactionHistory();
                th.showTransactions(accountName);
                break;
            case 5:
                System.out.println("Thank you for using the Bank ATM");
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("Do you want to perform any other transactions ? (y/n)");
        ch = System.console().readLine().charAt(0);
        if(ch == 'n' || ch == 'N')
        System.out.println("Thank you for using the Bank ATM");
    }while(ch == 'y' || ch == 'Y');
    }
    public static void main(String args[])
    {   
        accounts.put("John", "1234");
        accountBalance.put("John", 1000);

        accounts.put("Jane", "5678");
        accountBalance.put("Jane", 2000);

        System.out.println("Welcome to the Bank ATM");

        System.out.println("1.Login to existing account");
        System.out.println("2.Create new account");

        int choice = Integer.parseInt(System.console().readLine());

        if(choice==1){
        System.out.println("Please enter your account name");
        String accountName = System.console().readLine();
        if(accounts.containsKey(accountName))
        {
            System.out.println("Please enter your password");
            String password = System.console().readLine();
            if(accounts.containsValue(password))
            {
                System.out.println("Welcome " + accountName);
                choiceMain(accountName);
            }
            else
            {
                System.out.println("Incorrect password");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Account does not exist");
            System.exit(0);
        }

    }
    else if(choice==2){
        System.out.println("Minimum balance for account creation is 100 ");
        System.out.println("\nPlease enter your account name");
        String accountName = System.console().readLine();
        System.out.println("Please enter your password");
        String password = System.console().readLine();
        accounts.put(accountName, password);
        accountBalance.put(accountName, 0);
        System.out.println("Account created");
        accountBalance.put(accountName, 100);
        transactionHistory.put(accountName, "Account created");
        main(args);
    }
}
}
