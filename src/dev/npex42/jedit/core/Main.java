package dev.npex42.jedit.core;
import dev.npex42.swingml.*;
public class Main {

    public static void main(String[] args) {
        Application app = SwingML.Create("TestWindow.xml");
        app.addActionListener("hello", (e) -> {
            System.out.println("Hello, World");
        });

        app.start();
    }
}
