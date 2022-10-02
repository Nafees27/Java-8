package Java8;/*
    Q2) Using (instance) Method reference create and apply
    add and subtract method and using (Static) Method reference create
    and apply multiplication method for the functional interface created
 */

public class Ques2
{
    public static void main(String[] args)
    {
        Calculator mul = operation::multiply;
        mul.calculation(2,3);

        Calculator add = new operation()::addition;
        add.calculation(2,3);

        Calculator sub = new operation()::subtraction;
        sub.calculation(2,3);
    }
}

class operation
{
    // static method
    public static void multiply(int num1, int num2)
    {
        System.out.println(num1*num2);
    }

    // Instance method
    public void addition(int a, int b)
    {
        System.out.println(a+b);
    }

    public void subtraction(int a, int b)
    {
        System.out.println(a-b);
    }
}

@FunctionalInterface
interface Calculator
{
    void calculation(int a, int b);
}
