package Java.javacore;

public class employee {
    
    public int id;
    public String name;
    public int age;
    public int baseSalary;

    public employee() {

    }

    public employee(int id, String name, int age, int baseSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        double salary = 0.0;
        if(age <= 17) {
            return salary = baseSalary;
        } else {
            if(age >= 18 && age <= 25) {
                return salary = baseSalary + 0.03 * baseSalary;
            } else {
                if(age >= 26 && age <= 35) {
                    return salary = baseSalary + 0.06 * baseSalary;
                } else {
                    if(age >= 36) {
                        return salary = baseSalary + 0.1 * baseSalary;
                    }
                }
            }
        }
        return salary;
    }

    public employee copy() {
        employee employee = new employee(id, name, age, baseSalary);
        return employee;
    }

    public void printInformation() {
        System.out.printf("Employee[id = %d, name = %s, age = %d, baseSalary = %d]", id, name, age, baseSalary);
    }
}
