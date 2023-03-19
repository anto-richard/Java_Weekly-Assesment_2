import java.util.*;
public class EmpMan
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter the employee's name : ");
        employee.Name = s.nextLine();
        System.out.print("Enter the employee's age : ");
        employee.Age = s.nextInt();
        s.nextLine();
        System.out.print("Enter the employee's phone number : ");
        employee.Phone_number = s.nextLine();
        System.out.print("Enter the employee's address : ");
        employee.Address = s.nextLine();
        System.out.print("Enter the employee's salary : ");
        employee.Salary = s.nextDouble();
        s.nextLine();
        System.out.print("Enter the employee's specialization : ");
        employee.specialization = s.nextLine();

        Manager manager = new Manager();
        System.out.print("Enter the manager's name : ");
        manager.Name = s.nextLine();
        System.out.print("Enter the manager's age : ");
        manager.Age = s.nextInt();
        s.nextLine();
        System.out.print("Enter the manager's phone number : ");
        manager.Phone_number = s.nextLine();
        System.out.print("Enter the manager's address : ");
        manager.Address = s.nextLine();
        System.out.print("Enter the manager's salary : ");
        manager.Salary = s.nextDouble();
        s.nextLine();
        System.out.print("Enter the manager's department : ");
        manager.department = s.nextLine();

        System.out.println("Employee details:");
        System.out.println("Name: " + employee.Name);
        System.out.println("Age: " + employee.Age);
        System.out.println("Phone number: " + employee.Phone_number);
        System.out.println("Address: " + employee.Address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager details:");
        System.out.println("Name: " + manager.Name);
        System.out.println("Age: " + manager.Age);
        System.out.println("Phone number: " + manager.Phone_number);
        System.out.println("Address: " + manager.Address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
