public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

    
        employees[0] = new Manager("John Doe", 50000);
        employees[1] = new Worker("Jane Smith", 60000, "Developer");
        employees[2] = new Worker("Michael Johnson", 55000, "QA Engineer");
        employees[3] = new Manager("Emily Davis", 52000);
        employees[4] = new Worker("David Brown", 53000, "Designer");

    
        employees[5] = new Manager("Alex Johnson", 48000);
        employees[6] = new Worker("Emma Wilson", 47000, "Data Analyst");

    
        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }

    
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                Manager manager = (Manager) emp;
                manager.setNumberOfSubordinates(3);
                manager.setSalary(75000);
            }
        }

       
        System.out.println("Updated information for all employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}