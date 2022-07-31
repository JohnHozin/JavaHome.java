package lesson16;

public class Pevec2 extends Thread {
    public void run() {
        while (true) {
            synchronized (Monitor.MIKROFON) {
                try {
                    Monitor.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 3; i++) {

                System.out.println("--------------PaPa");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



            }
            synchronized (Monitor.MIKROFON) {

                Monitor.MIKROFON.notify();

            }

        }
    }
}