package ru.netology.concurrent.homework.task1;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Pbx extends Thread {

    private int countOfCalls = 1;
    private final ConcurrentLinkedQueue<Integer> queue;
    protected static boolean onWork = false;
    private static final int NEW_CALL = 16;

    public Pbx(String name, ConcurrentLinkedQueue<Integer> queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!onWork) {
            queue.add(countOfCalls);
            countOfCalls++;
            try {
                Thread.sleep(NEW_CALL);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
