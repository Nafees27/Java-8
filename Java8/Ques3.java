/*
    Q3)Create a thread using lambda function

 */

package Java8;

public class Ques3
{
    public static void main(String[] args)
    {
        // thread using lambda Function
        Runnable th = ()->{
            System.out.println("Current thread is running......");
        };

        Thread t = new Thread(th);
        t.start();

    }
}
