public class Add {
    public static void sumFirstAndLastDigit(int number) {
        if (number > 0) {
//            System.out.println("valid");


            int firstnumber = 0;
            int lastnumber = 0;

            lastnumber = number % 10;
            while (number != 0) {
                firstnumber = number;
                number = number / 10;
            }

            System.out.println("First number :" + firstnumber);
            System.out.println("last number :" + lastnumber);

            System.out.println(firstnumber + lastnumber);


        } else {
            System.out.println("invalid");

        }}
            public static void main (String[]args){
                int number =-9876;
                sumFirstAndLastDigit(number);
            }

    }