package entities;

import java.time.LocalDate;

public class Employee extends Person {
    private String name;
    private double salary;
    private LocalDate hireDay;

    /***
     * Definisco due costruttori
     * @param n
     * @param s
     * @param year
     * @param month
     * @param day
     */
    public Employee(String n, double s, int year, int month, int day) {
        this(n, s, LocalDate.of(year, month, day));
    }

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "entities.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    /***
     * Metodo accessore per leggere lo stato dell'attributo nome
     * @return Nome
     */
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /***
     * Metodo mutatore
     * @param byPercent
     */
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void getDescription() {
        System.out.println("lol");
    }

}
