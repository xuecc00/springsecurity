package com.mmall.demo;

public class DemoRun {

    public static void main(String[] args) {
        ThreadJoinDemo j1 = new ThreadJoinDemo();
        ThreadJoinDemo j2 = new ThreadJoinDemo();
        j1.setName("j1");
        j2.setName("j2");
        j1.start();
        try {
            j1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j2.start();



    }
   /* public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("123");
            }
        }.start();
    }*/
}
