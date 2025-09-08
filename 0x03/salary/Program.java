public class Program {
    public static void main(String[] args) {
        Department engineeringDepartment = new Department(1000, 1100);
        Department documentationDepartment = new Department(1000, 800);

        Employee engineeringEmployee1 = new Employee(2300);
        Employee engineeringEmployee2 = new Employee(3650);
        Manager engineeringManager = new Manager(5800);

        Employee documentationEmployee1 = new Employee(2500);
        Employee documentationEmployee2 = new Employee(3000);
        Manager documentationManager = new Manager(4980);

        printLine(engineeringEmployee1, engineeringDepartment);
        printLine(engineeringEmployee2, engineeringDepartment);
        printLine(engineeringManager, engineeringDepartment);
        printLine(documentationEmployee1, documentationDepartment);
        printLine(documentationEmployee2, documentationDepartment);
        printLine(documentationManager, documentationDepartment);
    }

    private static void printLine(Employee emp, Department dept) {
        String line = String.format(
                "Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f",
                emp.getFixedSalary(),
                emp.calculateTotalSalary(dept),
                emp.calculateBonus(dept)
        );
        System.out.println(line.replace('.', ','));
    }
}