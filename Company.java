public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Doe", 50000);
        employees[1] = new Employee("Jane Smith", 60000);
        employees[2] = new Employee("Michael Johnson", 55000);
        employees[3] = new Employee("Emily Davis", 52000);
        employees[4] = new Employee("David Brown", 53000);

        System.out.println("Details for employee at index 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(60000);

        System.out.println("\nDetails for all employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}