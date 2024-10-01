
    class Multi3 extends Thread {
        @Override
        public void run() {

            for(int n=1;n<=5;n++){
                try {
                    Thread.sleep(1000);
                    System.out.println(n);
                } catch (InterruptedException e) {
                    System.out.println("no thread found");
                }
            }
        }

        public static void main(String[] args) {
            Multi3 m=new Multi3();
            m.start();
        }
    }


