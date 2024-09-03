public class Boostcompany {
    int boostMRP=100;
    int boostSellingprice=80;
    public Boostcompany(int boostMRP) {
        this.boostMRP = boostMRP;
    }
}
class Dealer extends Boostcompany {
    int bootsMRP = 100;
    int boostSellingprice = 90;
    public Dealer(int bootMRP) {
       super(bootMRP);
    }
}
class Shop extends Dealer {
   int boostMRP=100;
  int boostSellingprice=98;
    public Shop(int boostMRP) {
      super(boostMRP);
      this.boostMRP=boostMRP;
    }
    public static void main(String[] args) {
        Boostcompany v=new Shop(110);
        Boostcompany y=(Boostcompany) v;
        System.out.println("Boost MRP : "+y.boostMRP);
    }
}