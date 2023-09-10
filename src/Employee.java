public class Employee {
    // Instance variables
    private String name; // employee name
    private int number; // employee number
    private double salary; // employee salary

    // Constructor to initialize the instance variables
    public Employee(String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    // Method to return the tax percentage as a decimal
    public double getTaxPercentage() {
        int salaryBracket = (int) Math.floor(salary / 10000.0); // Determine the salary bracket
        double[] taxRates = {0.0, 0.1, 0.2, 0.25}; // Array of tax rates
        return taxRates[Math.min(salaryBracket, taxRates.length - 1)]; // Return the tax rate for the salary bracket
    }

    // Method to calculate the tax amount based on the salary
    public double calculateTax() {
        double tax = 0.0;
        double afterTax = 0;
        tax = salary * getTaxPercentage();
        afterTax = salary - tax;
        return afterTax;
    }

    // Method to display the employee information including the tax amount and tax percentage
    public void displayInfo() {
        // Display data
        System.out.println("Name " + "\t" + "Employee No " + "\t" + " Salary " + "\t" + "After Tax " + "\t" + "Tax value");
        System.out.println(name + "\t" + number + "\t\t" + salary + "\t" + calculateTax() + "\t" + getTaxPercentage() * 100 + "%");
    }
}
