package com.company;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    int x = 33;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != x) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Task " + x + " is failed");
            }
        }
    }
}
