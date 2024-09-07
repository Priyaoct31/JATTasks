package jatTasks6;

public class Person {


		private String name;
	    private int age;

	    // Constructor
	    public Person (String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }
	    
	    // Main method to test the Person class
	    public static void main(String[] args) {
	        // Creating a new Person object
	        Person person = new Person("John", 25);
	        
	        // Accessing attributes using getter methods
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }

}
