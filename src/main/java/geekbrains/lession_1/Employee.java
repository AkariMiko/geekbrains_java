package geekbrains.lession_1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int number;
    private int wage;
    private int age;

    public Employee(String name, String position, String email, int number, int wage, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.number = number;
            this.wage = wage;
            this.age = age;
        }

    public String getName() {
            return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWage() {
        return wage;
    }

    public int getAge() {
            return age;
    }

    public void printPersonalInfo() {
            System.out.printf("Name: %s, Position: %s, Email: %s, Number: %s, Wage: %s, Age: %s%n", name, position, email, number, wage, age);
    }

    @Override
    public String toString() {
            return "Employee:" + " name=" + name + ", position=" + position + ", email=" + email + ", number=" + number + ", wage=" + wage + ", age=" + age;
    }
}
