package дуы17;

import lesson16.Monitor;
import lesson16.homeWork.Pevec3;
import org.apache.log4j.Logger;




import lesson16.Monitor;
import org.apache.log4j.Logger;
    public class Main extends Thread {
        private static final Logger LOGGER = Logger.getLogger(lesson16.homeWork.Pevec3.class);
        private boolean needStop = false;
        public void run() {
            int count = 0;
            while (!needStop) {
                count++;
                if (count == 3) needStop = true;
                synchronized (Monitor.MIKROFON) {
                    try {
                        Monitor.MIKROFON.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                LOGGER.info("Проснулся: " + Thread.currentThread().getName());
                for (int i = 0; i < 3; i++) {
                    System.out.println("--------------Zaza");
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

            }
        }
    }

