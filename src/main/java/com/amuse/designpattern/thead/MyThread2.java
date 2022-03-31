package com.amuse.designpattern.thead;

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author 刘培振
 * @Date 2021-06-21 20:39
 * @Version 1.0
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if(this.interrupted()){
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i = " + (i+1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("被捕捉到了");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThread2 thread = new MyThread2();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
