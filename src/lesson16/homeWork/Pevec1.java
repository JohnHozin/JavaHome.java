package lesson16.homeWork;

import lesson16.Monitor;
import org.apache.log4j.Logger;
public class Pevec1 extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Pevec1.class);
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop) {
            count++;
            if (count == 3) needStop = true;

            LOGGER.info("Проснулся: " + Thread.currentThread().getName());
            for (int i = 0; i < 3; i++) {
                System.out.println("Lala--------------");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            LOGGER.info("Уснул: " + Thread.currentThread().getName());
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