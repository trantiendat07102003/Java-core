package Java.javacore;

public class tester extends employee{
    
    public String type;

    public tester() {

    }
    
    public tester(int id, String name, int age, int baseSalary, String type) {
        super(id, name, age, baseSalary);
        this.type = type;
    }

    @Override
    public double getSalary() {
        if("administrative tester".equalsIgnoreCase(type)) {
            return baseSalary + 0.25 * baseSalary;
        } else {
            return baseSalary + 0.05 * baseSalary;
        }
        
    }

    @Override
    public tester copy() {
        tester tester = new tester(id, name, age, baseSalary, type);
        return tester;
    }

    @Override
    public void printInformation() {
        System.out.printf("Tester[id = %d, name = %s, age = %d, baseSalary = %d, type = %s]", id, name, age, baseSalary, type);
    }
}
