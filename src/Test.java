import java.util.*;
/**
 * Created by kq644 on 2017/2/8.
 */
public class Test extends Thread{

    int pauseTime;
        String name;
        public Test(int x, String n) {
            pauseTime = x;
            name = n;
        }
        public void run() {
            while(true) {
                try {
                    System.out.println(name + ":" + new
                            Date(System.currentTimeMillis()));
                    Thread.sleep(pauseTime);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
        static public void main(String args[]) {
            Test tp1 = new Test(1000, "Fast Guy");
            tp1.start();
            Test tp2 = new Test(3000, "Slow Guy");
            tp2.start();

        }


}
