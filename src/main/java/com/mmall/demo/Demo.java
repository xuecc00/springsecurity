package com.mmall.demo;


public class Demo extends Object implements Runnable{

    public Demo() {
        Thread myThread = new Thread(this);
        myThread.start();
    }

    @Override
    public void run() {
        for (int i=0;i<6;i++){
            System.out.println(this);
        }
    }
}

