package lesson16;

public class Main {

    public static void main(String[] args) {

//        MyThread myThread = new MyThread();
//        myThread.start();
        Thread myTread = new Thread(new MyThread());
        myTread.start();
        myTread.setName("Toha");
        //myTread.setDaemon(true);

        for (int i = 0; i < 10; i++) {
            System.out.println(i+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}