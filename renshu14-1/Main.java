public class Main{
  public static void main(String[] args){
    Account a = new Account();
    a.accountNumber = "4649";
    a.balance = 1592;
    Account b = new Account();
    b.accountNumber = "46443";
    System.out.println(a);
    System.out.println(b.equals(a));
  }
}