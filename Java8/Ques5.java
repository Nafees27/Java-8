package Java8;/*
    Q5)Implement multiple inheritance with default method inside interface.
 */

interface car
{
    default void ferrari()
    {
        System.out.println("This is ferrari car");
    }
}

interface bike
{
    default void ninja()
    {
        System.out.println("This bike is from Kawashaki");
    }
}

//
class machine implements bike, car {}

public class Ques5
{
    public static void main(String[] args)
    {
            machine checkMachine = new machine();
            checkMachine.ferrari();
            checkMachine.ninja();
    }
}
