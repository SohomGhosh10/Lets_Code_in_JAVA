public class Thread_Class {
    public static void main(String[] args){
        MyThread1 mt = new MyThread1();
        MyThread2 mt2 = new MyThread2();

        mt.start();
        mt2.start();
    }
}

class MyThread1 extends Thread{
    
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class MyThread2 extends Thread{

    public void run(){
        System.out.println("Thread 2 is running");
    }
}
