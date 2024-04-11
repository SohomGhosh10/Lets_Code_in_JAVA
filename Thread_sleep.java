public class Thread_sleep {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        MyThread2 m = new MyThread2();

        mt.start();
        m.start();
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
    }
}
