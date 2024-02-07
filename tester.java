package Java.javacore;

public class tester extends employee{
    
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public tester() {

    }
    
    public tester(int id, String name, int age, int baseSalary, String type) {
        super(id, name, age, baseSalary);
        this.type = type;
    }

    @Override
    public double getSalary() {
        if("administrative tester".equalsIgnoreCase(type)) {
            return getBaseSalary() + 0.25 * getBaseSalary();
        } else {
            return getBaseSalary() + 0.05 * getBaseSalary();
        }
        
    }

    @Override
    public tester copy() {
        tester tester = new tester(getId(), getName(), getAge(), getBaseSalary(), getType());
        return tester;
    }

    // @Override
    // public void printInformation() {
    //     System.out.printf("Tester[id = %d, name = %s, age = %d, baseSalary = %d, type = %s]", id, name, age, baseSalary, type);
    // }

    @Override
    public String toString() {
        return super.toString();
    }
}
