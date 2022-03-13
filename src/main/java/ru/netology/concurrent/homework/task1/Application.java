package ru.netology.concurrent.homework.task1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import static ru.netology.concurrent.homework.task1.Pbx.onWork;

public class Application {
    private static final List<String> staff = Arrays.asList("John", "Mike", "Alex", "Amanda", "Lex", "Pamela", "Judy", "Rajesh", "Shang", "Lucy");
    private static final ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
    private static final Pbx pbx = new Pbx("PBX", queue);

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
        System.out.println("On hold are " + queue.size() + " calls!");
        staffInOffice();
    }

    private static void endOfShift() {
        onWork = true;
    }

    private static void staffInOffice() {
        for (String s : staff) {
            new Staff(s, queue).start();
        }
    }
}
