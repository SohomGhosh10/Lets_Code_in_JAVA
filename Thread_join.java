public class Thread_join {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        MyThread2 m = new MyThread2();

        mt.start();
        try{
            mt.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        m.start();
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("RUN");
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("RUN & EAT");
    }
}