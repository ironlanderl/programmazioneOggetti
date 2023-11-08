import entities.Employee;
import entities.Manager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pippo", 1000, 2013, 5, 12);
        Employee e2 = new Employee("Pluto", 1500, 2019, 4, 13);

        Manager m1 = new Manager("Tizio", 3000, LocalDate.of(1990, 5, 5), 200);

        Employee[] eArr = {
                e1,
                e2,
                m1
        };
        Manager m = (Manager)eArr[2];
    }
}