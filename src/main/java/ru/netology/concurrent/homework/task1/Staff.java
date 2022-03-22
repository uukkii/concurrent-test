package ru.netology.concurrent.homework.task1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Staff extends Thread {
    protected static final List<String> STAFF = Arrays.asList("John", "Mike", "Alex", "Amanda", "Lex", "Pamela", "Judy", "Rajesh", "Shang", "Lucy");
    private static final int ON_LINE = 4000;
    private final ConcurrentLinkedQueue<Integer> queue;

    public Staff(String name, ConcurrentLinkedQueue<Integer> queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!queue.isEmpty()) {
            try {
                Integer nextElementOfQueue = queue.poll();
                System.out.printf("\nSpecialist %s is answering on request # %d", Thread.currentThread().getName(), nextElementOfQueue);
                Thread.sleep(ON_LINE);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
