public class Runnable_Interface {
    public static void main(String[] args){
        MyThread m = new MyThread();
        Thread th = new Thread(m);

        MyThread2 m1 = new MyThread2();
        Thread th1 = new Thread(m1);

        th.start();
        th1.start();
    }
}

class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread1 is running");
    }
}

class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Thread2 is running");
    }
}
