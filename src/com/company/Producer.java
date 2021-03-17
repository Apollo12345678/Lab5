package com.company;

public class Producer extends Thread{
    private String valami;
    private Fifo fifo;
    private int waitTime;

    public Producer( String valami, Fifo fifo, int time) {
        this.valami = valami;
        this.fifo = fifo;
        waitTime=time;
    }

    @Override
    public void run() {
        int szam=0;
        try{
            while(true){
                fifo.put(valami+" "+szam);
                System.out.println("produced "+valami+" "+szam+" "+System.currentTimeMillis());
                szam++;
                Thread.sleep(waitTime);
            }
        }catch (InterruptedException ex){
            System.out.println("Interrupted");
        }
    }
}
