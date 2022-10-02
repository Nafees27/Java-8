package Java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    4.) WAP using java 8:

    (a)Collect all  even numbers from a list using stream
    (b)Given a list of objects of following class:
           class Employee
           {
            String fullName;
            Long salary;
            String city;
           }

          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
          Note: Full name is concatenation of first name, middle name and last name with single space in between.
 */
public class Ques4
{
    public static void main(String[] args)
    {
        // Ans : (a)
        List<Integer> numList = Arrays.asList(2,3,4,5,6,9,12,15,11,18,23);
        numList
                .stream()
                .filter(value -> value % 2==0)
                .forEach(System.out::println);


        // Ans : (b)
        Employee emp1 = new Employee("Rashid Bin Salman",4000L,"Delhi");
        Employee emp2 = new Employee("Rashid ul Akhlak",2900L,"Maharastra");
        Employee emp3 = new Employee("Abdul rizvi Rashid",4500L,"Delhi");
        Employee emp4 = new Employee("Sams al Suleman",3900L,"Delhi");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        HashSet set = (HashSet) (employeeList.stream()
                .filter(emp -> emp.getSalary()<5000 && emp.getCity().equals("Delhi"))
                .map(emp->emp.getFullName().split(" ")[0]).collect(Collectors.toSet()));

        System.out.println(set);

    }

}

class Employee
{
    String fullName;
    long salary;
    String city;

    public Employee(String fullName, Long salary, String city)
    {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName()
    {
        return this.fullName;
    }

    public long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}
