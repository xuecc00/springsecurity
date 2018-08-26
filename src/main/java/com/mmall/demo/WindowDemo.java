package com.mmall.demo;

import javax.swing.*;
import java.awt.*;

public class WindowDemo {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = environment.getDefaultScreenDevice();
        device.setFullScreenWindow(window);
        //device.setDisplayMode();

    }

}
