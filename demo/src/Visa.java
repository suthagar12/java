import java.util.Scanner;

abstract class Visa {
    int cardnumber = 87655;
    int pin = 5675;
    int num1;
    int num2;
    public abstract boolean authendicate(int pin, int cardnumber);


    public abstract int getbalance();
    public abstract int withdraw(int amount);
}
class Bank1 extends Visa{

    @Override
    public boolean authendicate(int pin, int cardnumber) {
        return this.pin == pin && this.cardnumber == cardnumber;
    }

    @Override
    public int getbalance() {
        return 10000;
    }

    @Override
    public int withdraw(int amount) {
        return amount;
    }
}
class Bank2 extends Visa{

    @Override
    public boolean authendicate(int pin, int cardnumber) {
        return this.pin == pin && this.cardnumber == cardnumber;

    }

    @Override
    public int getbalance() {

        return 134;
    }

    @Override
    public int withdraw(int amount) {
        return amount;
    }
}
class Bank3 extends Visa{

    @Override
    public boolean authendicate(int pin, int cardnumber) {
        return this.pin == pin && this.cardnumber == cardnumber;
    }

    @Override
    public int getbalance() {
        return 50000;
    }

    @Override
    public int withdraw(int amount) {
        return amount;
    }

    public static void main(String[] args) {
        Bank1 b1=new Bank1();
        Bank2 b2=new Bank2();
        Bank3 b3=new Bank3();
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter card number :");
//        int num1=scanner.nextInt();
//        System.out.println("enter pin number :");
//        int num2=scanner.nextInt();
        if(b1.authendicate(5675,87655)){
            System.out.println("Bank1 :"+b1.withdraw(400));
        }
        else{
            System.out.println("authendication faile");
        }
        b2.authendicate(769,654);
        b3.authendicate(3468,752);

        System.out.println("Bank2 :"+b2.withdraw(2000));
        System.out.println("Bank3 :"+b3.withdraw(198));
    }
}