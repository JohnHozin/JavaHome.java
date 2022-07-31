package lesson16;

public class Pevec1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop) {
            count++;
            if (count > 3) needStop = true;
            for (int i = 0; i < 3; i++) {
                System.out.println("Lala--------------");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
            synchronized (Monitor.MIKROFON) {

                Monitor.MIKROFON.notify();

            }
            synchronized (Monitor.MIKROFON) {
                try {
                    Monitor.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}