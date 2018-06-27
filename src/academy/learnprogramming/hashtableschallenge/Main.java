package academy.learnprogramming.hashtableschallenge;

import java.util.LinkedList;

import java.util.Iterator;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));
// declaring a hashmap to store the unique employees
// creating a linkedlist to store the duplicate employees that need to be removed from the 
// original linkedlist
//
        HashMap<Integer, Employee> myMap = new HashMap<Integer, Employee>();
        LinkedList<Employee> empRemove = new LinkedList<>();
       
// iterate over existing linked list of employees and add the unique employees to the hashmap
// add duplicate employees to the empRemove linked list        
        Iterator<Employee> iter = employees.iterator();
        while (iter.hasNext()) {
        	Employee e = iter.next();
        	if (myMap.containsKey(e.getId())){
        		empRemove.add(e);
        	}
        	else 
        	{
        		myMap.put(e.getId(), e );
        	}
        }
      
// iterate over the linked list containing the list of employees to be removed and remove them from
// original linked list        
        Iterator<Employee> iterRemove = empRemove.iterator();
        while (iterRemove.hasNext()) {
        	 Employee e = iterRemove.next();
        	 employees.remove(e);
        }
        
        System.out.println("Printing unique list");
        employees.forEach(e -> System.out.println(e));
        


    }
    
    
}
