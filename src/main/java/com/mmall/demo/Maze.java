package com.mmall.demo;

public class Maze {

    private int playerX;
    private int playerY;
    private Object obj = new Object(); //同一把锁
    public boolean isexit(){
        synchronized(obj){
            return ( playerX==0 && playerY==0);
        }
    }
    public void setPosition(int x,int y){
        synchronized(obj){
            playerX = x;
            playerY = y;
        }

    }

}
