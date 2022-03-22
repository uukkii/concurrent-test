package ru.netology.concurrent.homework.task1;

import java.util.concurrent.ConcurrentLinkedQueue;

import static ru.netology.concurrent.homework.task1.Staff.STAFF;
import static ru.netology.concurrent.homework.task1.Pbx.onWork;

public class Application {
    private static final ConcurrentLinkedQueue<Integer> REQUEST_QUEUE = new ConcurrentLinkedQueue<>();
    private static final Pbx pbx = new Pbx("PBX", REQUEST_QUEUE);

    public static void main(String[] args) {
        startShift();
        endOfShift();
    }

    private static void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    private static void startShift() {
        pbx.start();
        delay();
        System.out.println("On hold are " + REQUEST_QUEUE.size() + " calls!");
        staffInOffice();
    }

    private static void endOfShift() {
        onWork = true;
    }

    private static void staffInOffice() {
        for (String s : STAFF) {
            new Staff(s, REQUEST_QUEUE).start();
        }
    }
}
