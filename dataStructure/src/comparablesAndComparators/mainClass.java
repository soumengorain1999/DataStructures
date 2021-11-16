package comparablesAndComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Student> list=new ArrayList<>();
	
	list.add(new Student(23, "Ram"));
	list.add(new Student(35, "Shyam"));
	list.add(new Student(83, "Aman"));
	list.add(new Student(13, "Anuj"));
	list.add(new Student(65, "Anuj"));
	Collections.sort(list);
	list.forEach(System.out::println);
	
	}

}
