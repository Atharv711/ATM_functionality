public class TransactionHistory
{   
    public void showTransactions(String accountName)
    {
     for(String key : Main.transactionHistory.keySet())
     {
         if(key.equals(accountName))
         {
             System.out.println(Main.transactionHistory.get(key));
         }
     }
    }
}