 class Multi extends Thread {
     @Override
     public void run() {
         try{
             System.out.println("Welcome to Thread "+Thread.currentThread().getId());
         }catch (Exception E){
             System.out.println("thread not found");
         }
     }

     public static void main(String[] args) {
         int i=5;
         for(int n=0;n<i;n++){
             Multi m=new Multi();
             m.start();
         }
     }
 }
