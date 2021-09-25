package com.company;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener faillistener = System.out::println;

        Worker worker = new Worker(listener, faillistener);
        worker.start();
    }
}
