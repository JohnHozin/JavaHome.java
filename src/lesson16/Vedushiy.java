package lesson16;


import lesson15.Main;
import org.apache.log4j.Logger;

public class Vedushiy {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        Pevec1 pevec1 = new Pevec1();
        Pevec2 pevec2 = new Pevec2();
        pevec2.setDaemon(true);
        System.out.println("hellow start");
        pevec1.start();
        pevec2.start();
        while (pevec1.isAlive()){

        }
        System.out.println("finish!!!");
        // Runnable runnable = () -> LOGGER.info("Logging info");
        LOGGER.info("sleep"+Thread.currentThread().getName());

    }
}