package Java8;

/*
   Q1) Write the following a functional interface and implement it using lambda:

        First number is greater than second number or not Parameter (int ,int ) Return boolean
        Increment the number by 1 and return incremented value Parameter (int) Return int
        Concatenation of 2 string Parameter (String , String ) Return (String)
        Convert a string to uppercase and return . Parameter (String) Return (String)

*/

interface GreaterNumber
{
    boolean isGreaterNumber(int a, int b);
}

interface IncrementValue
{
    int increment(int a);
}

interface ConcatString
{
    String concat(String a, String b);
}

interface ToUppercase
{
    String toUppercase(String a);
}

public class Ques1 {
    public static void main(String[] args) {
        // Checking the 1st number is greater than 2nd or not
        GreaterNumber greatNumber = (a, b) -> {
            if (a > b) return true;
            else return false;
        };
        System.out.println(greatNumber.isGreaterNumber(5, 6));

        // Increment the value by 1
        IncrementValue incValue = (a) -> a + 1;
        System.out.println(incValue.increment(244));

        // concat two string
        ConcatString conString = (str1, str2) -> str1 + str2;
        System.out.println(conString.concat("Nafees", "Ahmad"));

        // convert lower case to uppercase
        ToUppercase upperCase = (str) -> str.toUpperCase();
        System.out.println(upperCase.toUppercase("hello hi !"));

    }
}
