package HRApp;

public class Department {

    private Employee[] employees = new Employee[10];
    private int lastValidEmployee = -1;

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) continue;
            employees[i] = employee;
            lastValidEmployee += 1;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public Employee[] getEmployees() {
        if (lastValidEmployee == -1) return new Employee[0];

        Employee[] nonNullEmployees = new Employee[lastValidEmployee + 1];

        for (int i = 0; i < lastValidEmployee + 1; i++) {
            nonNullEmployees[i] = employees[i];
        }

        return nonNullEmployees;
    }

    public int getNumberOfEmployees() {
        return lastValidEmployee + 1;
    }

    public Employee getEmployeeById(int id) {
        for (Employee e : getEmployees()) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public double getTotalEmployeeSalary() {
        double totalSalary = 0;

        for (Employee e : getEmployees()) {
            totalSalary += e.getSalary();
        }

        return totalSalary;
    }

    public double getAverageEmployeeSalary() {
        if (getNumberOfEmployees() == 0) return 0;

        return getTotalEmployeeSalary() / getNumberOfEmployees();
    }

    @Override
    public String toString() {
        return String.format(
            "Department [numberOfEmployees=%s, totalEmployeeSalary=%s, averageEmployeeSalary=%s]",
            getNumberOfEmployees(),
            getTotalEmployeeSalary(),
            getAverageEmployeeSalary()
        );
    }
}
