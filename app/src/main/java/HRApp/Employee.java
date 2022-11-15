package HRApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
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
