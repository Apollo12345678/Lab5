package com.company;

public class Application {
    public static void main(String[] args) {
        Fifo fifo=new Fifo();
        Producer producer1=new Producer("elso", fifo, 500);
        Producer producer2=new Producer("masodik", fifo,1000);
        producer1.start();
        /*try{
            Thread.sleep(500);
        }catch (InterruptedException ex){
            System.out.println("interrupted");
        }
        producer2.start();*/
        Consumer consumer=new Consumer(fifo, "harmadik", 1000);
        consumer.start();
    }
}
