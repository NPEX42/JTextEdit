package dev.npex42.jedit.core;

public class Async {

    public static void Run(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(false);
        t.start();
    }
}
