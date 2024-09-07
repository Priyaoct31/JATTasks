package jatTasks6;

public class Employee {

	// Attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for ID
    public int getID() {
        return id;
    }

    // Getter for First Name
    public String getFirstName() {
        return firstName;
    }

    // Getter for Last Name
    public String getLastName() {
        return lastName;
    }

    // Getter for Full Name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Getter for Salary
    public int getSalary() {
        return salary;
    }

    // Setter for Salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to get Annual Salary (salary * 12)
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise salary by a percentage
    public int raiseSalary(int percent) {
        this.salary += (salary * percent) / 100;
        return this.salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }

    // Main method to test Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(101, "John", "Doe", 5000);
        
        // Displaying employee details
        System.out.println(emp);

        // Testing raiseSalary method
        emp.raiseSalary(10);  // Raises salary by 10%
        System.out.println("After raise: " + emp.getSalary());

        // Displaying annual salary
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
    }

}
