package HRApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Department {

    private Employee[] employees = new Employee[10];

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) continue;
            employees[i] = employee;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
