public class Withdrawl {
    public void withdrawl(String accountName)
    {   
        System.out.println("Please enter the amount you wish to withdraw");
        int withdrawlAmount = Integer.parseInt(System.console().readLine());

        int currentBalance = Main.accountBalance.get(accountName);

        if(currentBalance > withdrawlAmount)
        {
            int newBalance = currentBalance - withdrawlAmount;
            Main.accountBalance.put(accountName, newBalance);
            System.out.println("You have withdrawn " + withdrawlAmount);

            Main.transactionHistory.put(accountName, "Withdrawl: " + withdrawlAmount);
        }
        else
        {
            System.out.println("You do not have enough funds to withdraw");
        }
    }
}
