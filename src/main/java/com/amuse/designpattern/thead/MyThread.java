package com.amuse.designpattern.thead;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author 刘培振
 * @Date 2021-06-21 19:59
 * @Version 1.0
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 300000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }


    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
//            Thread.currentThread().interrupt();
//            System.out.println("是否停止1？ = " + myThread.interrupted());
//            System.out.println("是否停止2？ = " + myThread.interrupted());
            System.out.println("是否停止1？ = " + myThread.isInterrupted());
            System.out.println("是否停止2？ = " + myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        Thread.currentThread().interrupt();
//        System.out.println("是否停止1？ = " + Thread.interrupted());
//        System.out.println("是否停止2？ = " + Thread.interrupted());
//    }



}
