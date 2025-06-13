package MyPack;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass2 {

	public static void main(String args[]) {
		
		List<User> users = new ArrayList<>();
		 
        users.add(new User(1, "Amit", 50000.0));
        users.add(new User(2, "Priya", 60000.0));
        users.add(new User(3, "Rahul", 55000.0));
        users.add(new User(4, "Sneha", 70000.0));
        users.add(new User(5, "Vikram", 48000.0));
        users.add(new User(6, "Pooja", 62000.0));
        users.add(new User(7, "Rohit", 75000.0));
        users.add(new User(8, "Neha", 58000.0));
        users.add(new User(9, "Ankit", 54000.0));
        users.add(new User(10, "Kiran", 67000.0));
        
        //users.stream().forEach((u)-> System.out.println(u.toString()));
        
        List<User> users2 = users.stream().filter((e) -> e.getSalary()>50000).collect(Collectors.toList());
        
        //users2.stream().forEach((u)-> System.out.println(u.toString()));
        
        //1
        users.stream().
        filter(u -> u.getName().charAt(0) == 'P').
        forEach((i) -> System.out.println(i));
        
        //2
        users.stream().
        filter(u -> u.getSalary() > 60000).
        forEach((i) -> System.out.println(i));
        
        //3
        users.stream().
        map(u -> u.getName().toUpperCase()).
        forEach((i) -> System.out.println(i));
        
        //4
        Map<Integer, String> map = users.stream().
        collect(Collectors.toMap(i->i.getUid(), i->i.getName()));
	    System.out.println(map);
	    
	    Collections.sort(users,(u1,u2)-> u1.getName().compareTo(u2.getName()) );
        
	    users.forEach((e)-> System.out.println(e.toString()));
	    
	    Collections.sort(users, (u1, u2) -> u1.getSalary().compareTo(u2.getSalary()));
	    
	    users.forEach((e)-> System.out.println(e.toString()));
	    
	    System.out.println(  users.stream().max((u1,u2)-> Double.compare(u1.getSalary(),u2.getSalary())));

        
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("Enter your name : ");
	    Scanner sc = new Scanner(System.in);
        String emp_name=sc.nextLine();
        
        users.stream().filter((user)->user.getName().equals(emp_name)).forEach((user)->System.out.println(user.getSalary()));
        
        
		
		int a[] = {4, 6, 7, 3, 4, 5, 6, 7};

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> dupli = new ArrayList<>();

        for (int num : a) {
            if (list.contains(num)) {
                if (!dupli.contains(num)) {
                    dupli.add(num);
                }
            } else {
                list.add(num);
            }
        }

        System.out.println("Duplicate numbers are: " + dupli);
	
	}
}
