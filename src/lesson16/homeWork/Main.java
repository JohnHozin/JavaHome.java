package lesson16.homeWork;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Pevec1 pevec1 = new Pevec1();
        Pevec2 pevec2 = new Pevec2();
        Pevec3 pevec3 = new Pevec3();

        pevec1.setName("поток 1");
        pevec2.setName("поток 2");
        pevec3.setName("поток 3");

        System.out.println("Начало концерта!");
        LOGGER.info("Начало лога " + Thread.currentThread().getName());

        pevec1.start();
        pevec2.start();
        pevec3.start();

        while (pevec1.isAlive()) {
        }

        System.out.println("Конец концерта!");
        LOGGER.info("Конец лога " + Thread.currentThread().getName());
    }
}