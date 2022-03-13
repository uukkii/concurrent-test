package ru.netology.concurrent.homework.task1;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Staff extends Thread {
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
                System.out.printf("\nSpecialist %s is answering on request # %d", Thread.currentThread().getName(), queue.poll());
                Thread.sleep(ON_LINE);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
