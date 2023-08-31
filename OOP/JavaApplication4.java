package javaapplication4;
import java.util.ArrayList;
import java.util.*; 
  
/**
 *
 * @author Zahir
 */

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) { //constructor
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    
    Scanner sc = new Scanner(System.in);
    
    private List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        try{
            employeeList.add(employee);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public int removeEmployee(int id) throws IllegalArgumentException {
        Employee employeeToRemove = null;
        try{
            if(id<1){
                throw new IllegalArgumentException("Entered ID cannot be negative or 0.");
            }
            for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    employeeToRemove = employee;
                    break;
                }
            }
            
            if (employeeToRemove != null) {
                employeeList.remove(employeeToRemove);
            }
            else {
                System.out.println("Employee with ID:"+ id +" doesn't exist");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Message: "+e.getMessage());
        }
        return 0;
    }
     
    public int searchEmployee(int id) throws IllegalArgumentException{
        try{
            if(id<1){
                throw new IllegalArgumentException("Entered ID cannot be 0 or negative.");
            }
            for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    System.out.println(employee);
                    return 0;
                }
            }
            System.out.println("No employee exist of ID: "+id);
            return 0;
        }
        catch(IllegalArgumentException e){
            System.out.println("Message: "+e.getMessage());
        }
        return 0;
    }
    
    public int searchEmployee(String name)throws InputMismatchException{
        try{
           for (Employee employee : employeeList) {
                if (employee.getName().equals(name)) {
                    System.out.println(employee);
                    return 0;
                }
           }
           System.out.println("No employee exist of name: "+name);
           return 0;
        }
        catch(InputMismatchException e){
            System.out.println("Error: Value Must be string");
        }        
        return 0;   
    }
    
    public int editEmployee(int id) throws IllegalArgumentException{
        try{
            if(id<1){
                throw new IllegalArgumentException("Entered ID cannot be 0 or negative.");
            }
            for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    FullTimeEmployee emp1 = new FullTimeEmployee("Nadeem Khan", 15, 125000.0);
                    employeeList.set(employeeList.indexOf(employee), emp1);
                    return 0;
                }
            }
            System.out.println("Employee ID:"+id+" is wrong.");
            return 0;
        }
        catch(IllegalArgumentException e){
            System.out.println("Message: "+e.getMessage());
        }
        
        return 0;
    }

    public void displayAllEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class JavaApplication4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("Ahsan", 14, 25000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Zahir Khan", 121, 22, 500.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2); // Employees added

        System.out.println("Initial Employee Details:");
        payrollSystem.displayAllEmployees();

        try {
            System.out.print("\nEnter employee ID to search:");
            int searchId = sc.nextInt();
            payrollSystem.searchEmployee(searchId);
        }
        
        catch (InputMismatchException e) {
            System.out.println("Error: Value Must be an integer");
        }
            
        sc.nextLine(); // Clear the newline left in the buffer

        try{
            System.out.print("\nEnter employee name to search:");
            String searchName = in.nextLine();
            payrollSystem.searchEmployee(searchName);
        }
        catch(InputMismatchException e){
            System.out.println("Enter a string");
        }
        
        try{
            System.out.print("\nEnter employee ID to edit Employee details:");
            int editId = sc.nextInt();
            payrollSystem.editEmployee(editId);
            payrollSystem.displayAllEmployees();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Value Must be an integer");
        }

        sc.nextLine();
        
        try{
            System.out.print("\nEnter employee ID to remove Employee:");
            int removeId = sc.nextInt();
            payrollSystem.removeEmployee(removeId);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        finally{
            System.out.println("\nUpdated Employee Details:");
            payrollSystem.displayAllEmployees();
        }
        
    }
}







