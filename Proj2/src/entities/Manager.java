package entities;

import java.time.LocalDate;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, LocalDate hireDay, double bonus) {
        super(name, salary, hireDay);
        this.bonus = bonus;
    }

    public Manager(Employee emp, double newBonus) {
        super(emp.getName(), emp.getSalary(), emp.getHireDay());
        this.bonus = newBonus;
    }

    /***
     * Metodo accessore per bonus
     * @return
     */
    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
