package com.mmall.demo;


public class ThreadJoinDemo extends Thread{

    @Override
    public void run() {

        for (int i=0;i<1000;i++){
            System.out.println(getName()+":"+i);
        }

    }

}
