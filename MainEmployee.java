
/**
 *
 */
public class MainEmployee
{
    public static void main(String args[])
    {
        Employee e1 = new Employee("Anu","Bat",150, 140, 150, "IT", "AB12");
        Employee e2 = new Employee("Nomin","Dorj", 90, 100, 100, "Manager", "AB13");
        e1.printEmployee();
        e2.printEmployee();
        
        System.out.println(e1.getName()+ "-2 sariin avgSalary:" +e1.avgSalary(150, 140));
        System.out.println(e2.getName()+ "-3 sariin avgSalary:" +e2.avgSalary(90, 100, 100));
    }
}
