public class Deposit {
    public void deposit(String accountName)
    {
        System.out.println("Please enter the amount you wish to deposit");
        int depositAmount = Integer.parseInt(System.console().readLine());

        int currentBalance = Main.accountBalance.get(accountName);
        int newBalance = currentBalance + depositAmount;

        Main.accountBalance.put(accountName, newBalance);
        System.out.println("You have deposited " + depositAmount);

        Main.transactionHistory.put(accountName, "Deposit: " + depositAmount);
    }
}
