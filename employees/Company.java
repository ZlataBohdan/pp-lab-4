public static void main(String[] args) {
    Employee[] employees = new Employee[5];
    employees[0] = new Manager("John Doe", 50000);
    employees[1] = new Worker("Jane Smith", 60000, "Developer");
    employees[2] = new Worker("Michael Johnson", 55000, "QA Engineer");
    employees[3] = new Manager("Emily Davis", 52000);
    employees[4] = new Worker("David Brown", 53000, "Designer");

    int nonManagerCount = 0;

    for (Employee emp : employees) {
        if (!(emp instanceof Manager)) {
            nonManagerCount++;
        }
    }

    employees[0].setNumberOfSubordinates(nonManagerCount);
    employees[0].setSalary(7500);

    System.out.println("Details for all employees:");
    for (Employee emp : employees) {
        System.out.println(emp);
    }
}