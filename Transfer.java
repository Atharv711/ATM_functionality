public class Transfer {
    public void transfer(String accountName)
    {   
        System.out.println("Please enter the account number you wish to transfer to");
        int accountNumber = Integer.parseInt(System.console().readLine());

        System.out.println("Please enter the amount you wish to transfer");
        int transferAmount = Integer.parseInt(System.console().readLine());

        int currentBalance = Main.accountBalance.get(accountName);

        if(currentBalance > transferAmount)
        {
            int newBalance = currentBalance - transferAmount;
            Main.accountBalance.put(accountName, newBalance);
            System.out.println("You have transferred " + transferAmount + " to account number " + accountNumber);

            Main.transactionHistory.put(accountName, "Transfer: " + transferAmount + " to account number " + accountNumber);
        }
        else
        {
            System.out.println("You do not have enough funds to transfer");
        }
    

    }
}
