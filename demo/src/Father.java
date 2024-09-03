class Father {
    void talk() {
        System.out.println("Hello");
    }

}
interface Mother {
    void eat();
}
class Son extends Father implements Mother{

//    @Override
//    public void talk() {
//        System.out.println("talk politely with others");
//    }

    @Override
    public void eat() {
        System.out.println("eat neatly");
    }

    public static void main(String[] args) {
        Son s=new Son();
        s.talk();
        s.eat();
    }
}
