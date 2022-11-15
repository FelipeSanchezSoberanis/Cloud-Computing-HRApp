package HRApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Employee {

    private int id;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return String.format("Employee [id=%s, name=%s, salary=%s]", id, name, salary);
    }
}
