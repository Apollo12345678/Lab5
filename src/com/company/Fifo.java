package com.company;

import java.util.LinkedList;
import java.util.List;

public class Fifo {
    private List<String> myFifo=new LinkedList<>();
    private static int max=10;

    public synchronized void put(String be) throws  InterruptedException{
        if(myFifo.size()==max) this.wait();
        else{
            myFifo.add(be);
            this.notifyAll();
        }
    }

    public synchronized String get() throws  InterruptedException{
        String vissza="";
        if(myFifo.size()==0) this.wait();
        else{
            vissza= myFifo.get(myFifo.size()-1);
            myFifo.remove(myFifo.size()-1);
            this.notifyAll();
        }
        return vissza;
    }
}
