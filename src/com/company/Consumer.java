package com.company;

public class Consumer extends Thread{
    private Fifo f;
    private String s;
    private int n;

    public Consumer(Fifo f, String s, int n) {
        this.f = f;
        this.s = s;
        this.n = n;
    }

    @Override
    public void run() {
        try{
            while (true){
                System.out.println("consumed "+s+" "+f.get()+" "+System.currentTimeMillis());
                sleep(n);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
