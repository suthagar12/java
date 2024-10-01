 class Multi2 implements Runnable {
     @Override
     public void run() {
         System.out.println("thread 1:");
       try{
           for(int i=1;i<=5;i++){
               System.out.println(i);
           }
       }catch (Exception E){
           System.out.println("no match found");
       }
     }
 }
 class Multi5 implements Runnable{

     @Override
     public void run() {
         System.out.println("thread 2:");
         try{
             for(int i=6;i<=10;i++){
                 System.out.println(i);
             }
         }catch (Exception E){
             System.out.println("no match found");
         }
     }

     public static void main(String[] args) {
         Runnable a=new Multi2();
         Runnable b=new Multi5();
         Thread m=new Thread(a);
         Thread n=new Thread(b);
         m.start();
         n.start();
     }
 }
