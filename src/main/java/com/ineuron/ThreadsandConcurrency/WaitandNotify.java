package com.ineuron.ThreadsandConcurrency;

class Message{
    private String msg;
    public Message(String msg){ //This is a constructor
        this.msg=msg; //initially this will be null
        System.out.println("The message set is : "+this.msg);
    }
    public String getMessage(){ //This is a getter
        return this.msg;
    }
    public synchronized void setMessage(String str){ //setter won't return anything
        //synchronized means only one thread can run this method at a time
        this.msg=str;

        notify(); //notify the waiting thread after setting the message
    }
    public synchronized void waitForMessage(){
        while(this.msg==null){
            try{
                wait(); //wait if the message is null
            }catch (InterruptedException e){
                System.out.println("The thread is interrupted because of : "+e);
                e.printStackTrace();
            }
        }
    }

}

class Waiter implements Runnable{
    private Message msg ;// class Message can be used as a datatype in java
    public Waiter(Message m ){
        this.msg=m;
        System.out.println("the message now is inside the waiter constructor "+m.toString());
    }
    public void run() {
        msg.waitForMessage(); //just wait for message
        System.out.println("Waiter received the message: " + msg.getMessage());
    }
}

class Notifier implements  Runnable{
    private Message msg;
    public Notifier(Message m){
        this.msg=m;
        System.out.println("the message now is inside the notifier constructor "+m.toString());
    }
    public void run(){
        try{
            Thread.sleep(1000); // we are simulating some activity
            synchronized (msg){
                msg.setMessage("Notifier says: Hi there!");
                msg.notify();
            }
        }
        catch (InterruptedException e){
            System.out.println("Interrupted exception after sleeping Notifier "+e);
            e.printStackTrace();
        }

    }
}




public class WaitandNotify {
    public static void main(String[] args){
        //System.out.println("Wait and notify class ");
        Message msg = new Message(null); //initially the string is null
        Waiter waiter = new Waiter(msg); //waiter instance
        new Thread(waiter).start(); // waiter run method will run here ,thread started
        Notifier notifier = new Notifier(msg);
        new Thread(notifier).start(); //this will start another thread
    }
}
