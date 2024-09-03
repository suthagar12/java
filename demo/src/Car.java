public class Car {
    private String name;
    private int price;

    public void setName(String newname){
        name=newname;
    }

    public void setPrice(int newprice) {
        price=newprice;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.setName("kibutsuji");
        c.setPrice(10000);
        System.out.println(c.getName());
        System.out.println(c.getPrice());
    }
}



