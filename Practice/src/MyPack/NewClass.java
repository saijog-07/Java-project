package MyPack;

import java.util.*;
import java.util.stream.Collectors;

public class NewClass {

	public static void main(String args[]) {
		ArrayList<Employee> employees = new ArrayList<>();
		 
        employees.add(new Employee("Amit", 101, 50000, "HR", "Male"));
        employees.add(new Employee("Priya", 102, 60000, "Finance", "Female"));
        employees.add(new Employee("Rahul", 103, 55000, "IT", "Male"));
        employees.add(new Employee("Sneha", 104, 70000, "Admin", "Female"));
        employees.add(new Employee("Vikram", 105, 52000, "Sales", "Male"));
        employees.add(new Employee("Anjali", 106, 58000, "Marketing", "Female"));
        employees.add(new Employee("Rohit", 107, 61000, "IT", "Male"));
        employees.add(new Employee("Neha", 108, 67000, "Finance", "Female"));
        employees.add(new Employee("Suresh", 109, 53000, "HR", "Male"));
        employees.add(new Employee("Kriti", 110, 62000, "Admin", "Female"));
        
        Arrays.stream(employees).
        forEach((i) -> System.out.println(i.toString()));
        
        List<Employee> maleEmp = Arrays.stream(employees)
        .filter(i -> i.getGender().equals("Male"))
        .collect(Collectors.toList());
        
        Arrays.stream(employees).
        filter(i -> i.getSalary > 5000).
        forEach(i -> System.out.println(i.getName()));
	}
}
