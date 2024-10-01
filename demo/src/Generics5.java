class Generics5 {
    public static <T,U> void Pair(T key,U value){
        System.out.println("Key : "+key +","+"Value : "+value);
    }

    public static void main(String[] args) {
        Pair(1,"luffy");
        Pair(2,"naruto");
        Pair(3,"tanjiro");
        Pair(4,"saitama");
        Pair(5,"goku");
        Pair(6,"imu");
        Pair(7,"sasuke");
        Pair(8,"muzan");
        Pair(9,2.9);
        Pair(10,"friza");
    }
}