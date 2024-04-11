public class Thread_yield {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        MyThread2 m = new MyThread2();

        mt.start();
        m.start();

        System.out.println("Main method yielding");
        Thread.yield();
        mt.suspend();
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }

        mt.resume();

    }
}

class MyThread1 extends Thread{
    public void run(){
        System.out.println("RUN");
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("MY RUN");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
