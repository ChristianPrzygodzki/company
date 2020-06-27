package pl.przygodzki;

public class Employee {

    private String name;
    private String surname;
    private double salary;
    private int age;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public double getYearSalary(){
        return salary*12;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }
        else{
            System.out.println("Podałeś niepoprawne dane.");
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
