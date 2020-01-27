package homework3;

import java.util.ArrayList;

public class ArrayListClass {
	
public static void addPeInList(ArrayList <Person> people) {
		
		people.add(new Student("Drago", 970314, "TU","BiTT", 120130));
		people.add(new Student("Sofia", 394012, "SU","KT", 190123));
		people.add(new Professor("Profesor","Nikolov",true, 26, 18, 126));
		people.add(new Professor("Teacher","Dakov", false,22,29,99));
		people.add(new RichStudent2("David", 991340,"PU","IT",1281050));
		people.add(new RichStudent2("George", 9760489,"PU","IT",1782054));	
	}

 public void PrintPeople(ArrayList <Person> people) {
	 
	 int richstudent = 0;
	 int student = 0;
	 int profesor = 0;
	 
	 for(int i =0; i < people.size(); i ++ ){
		 
		 if(people.get(i)instanceof Student) {
			 
			 System.out.println("I am basic Student " + people.get(i).getClass().getName());
			 student ++;
		 }else if (people.get(i) instanceof Professor) {
			 
		 System.out.println("I am Profesor " + people.get(i).getClass().getName());
		 profesor++;
		 }else {
			 
			 System.out.println("I am rich Student " + people.get(i).getClass().getName());
			 richstudent++;
		 }
		 
 }
	
 }
}
