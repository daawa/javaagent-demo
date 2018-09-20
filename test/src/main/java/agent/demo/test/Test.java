package agent.demo.test;

/**
 * @author mochuan.zzw
 * @descreption
 */

public class Test {

    public static void main(String[] args) {
        System.out.println("main..");
        new Test().test1();
    }

    public void test1() {
        System.out.println("test1..");
        test2();

        try {
            Thread.currentThread().sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void test2() {
        System.out.println("test2..");
        try {
            Thread.currentThread().sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
