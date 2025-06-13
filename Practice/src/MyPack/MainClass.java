package MyPack;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class MainClass {

	public static void main(String args[]) {
		int arr[] = {3,5,6,8,1,2,3,5};
		
		String arr1[] = {"Mango", "Banana", "Papaya"};
		
		Arrays.stream(arr).forEach((i) -> System.out.println(i));
		
		Arrays.stream(arr1).forEach((i) -> System.out.println(i));
		
		Arrays.stream(arr).
		filter((i) -> i % 2 == 0).
		forEach((i) -> System.out.println(i));
		
		double salary[] = {1000, 2000, 3500, 8000, 10000, 6000, 5000, 5500, 4000};
		Arrays.stream(salary).filter((i)->i > 5000).forEach((i)->System.out.println(i));
		
		String names[] = {"Sai  ", "  Radha  ", " Kumar   ", "  Tanu   "};
		Arrays.stream(names).
        forEach((i) -> System.out.println(i.trim()));
		
		List <Integer>Marks = new ArrayList();
		
		 Marks.add(2);
		 Marks.add(2);
		 Marks.add(21);
	 
		 Marks.add(22);
	 
		 Marks.add(23);
	 
		 Marks.add(87);
	 
		 Marks.add(90);
		
		
			 Marks.stream().
			 map((i)->i+2).
			 forEach((e)->System.out.println(e));
			 
			
			 
		ArrayList <Integer> Employee = new ArrayList<>();
		Employee.add(5000);
		Employee.add(7000);
		Employee.add(3000);
		Employee.add(10000);
		Employee.add(150000);
		
		Employee.stream().
		map((i)->i+i*5/100).
		forEach((e)->System.out.println(e));
		
		ArrayList<Integer> Emp2 = new ArrayList<>();
		
		Employee.stream().
		map((i)->i+i*5/100).
		collect(Collectors.toList());
		
		
		List<String> users= new ArrayList();
		users.add("ASha");
		users.add("Pooja");
		users.add("kavita");
		users.add("deepa");
	   
		
		
		List<String> users2 = users.stream().
		filter(name -> Character.isUpperCase(name.charAt(0))).
        collect(Collectors.toList());
		
		users2.forEach((i)->System.out.println(i));
		
		
	}
	
}