public class BankAccount {
    protected int accountnumber;
    protected int balance;

    public BankAccount(int accountnumbr, int balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    void deposit( int amount){
        balance+=amount;
        System.out.println("Deposited : "+amount);
    }
    void withdrawl(int amount){
        if(balance>=amount) {
            balance -= amount;
            System.out.println("WithDrawel : " + amount);
        }else{
            System.out.println("InsufficentBalence");
            }
        }
        void display(){
            System.out.println("AccountNumber : "+accountnumber);
            System.out.println("Balance : "+balance);
        }

     void calculateinterest() {
    }
}
    class SavingsAccount extends BankAccount{
    int interestRate;

        public SavingsAccount(int accountnumbr, int balance,int interestedRate) {
            super(accountnumbr, balance);
            this.interestRate=interestedRate;
        }
        public void calculateinterest(){
            int interest=balance*interestRate/100;
            balance+=interest;
            System.out.println("InterestAdded :"+interest);
        }
        void display(){
            super.display();
            System.out.println("InterestRate :"+interestRate+"%");
        }


        public static void main(String[] args) {
            BankAccount bankAccount=new BankAccount(123456,1260);
            bankAccount.display();
            bankAccount.deposit(1000);
            bankAccount.withdrawl(200);
            bankAccount.display();
            bankAccount.calculateinterest();
        }
    }



