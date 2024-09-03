public class Error {
    public static void main(String[] args) {
        int a=11;
        int b=0;
        try{
            System.out.println(a/b);
        }catch(Exception E){
            System.out.println("invalid");
        }
        finally {
            System.out.println("bye");
        }
    }
}
