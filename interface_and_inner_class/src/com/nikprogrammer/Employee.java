package com.nikprogrammer;

/**
 * Created by
 * Nikolay on 12.05.2016.
 */
public class Employee implements Comparable<Employee>{
    public Employee(String n, double s){
        name = n;
        salary = s;
    }
    private String name;
    private double salary;

    public void raiseSalary(double byPerson){
        double raise = salary * byPerson/100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (salary < o.salary) return -1;
        if (salary > o.salary) return 1;
        return 0;
    }
}
