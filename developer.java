package Java.javacore;

public class developer extends employee {
    
    public int expYear;
    public String teamName;

    public developer() {

    }

    public developer(int id, String name, int age, int baseSalary, int expYear, String teamName) {
        super(id, teamName, age, baseSalary);
        this.expYear = expYear;
        this.teamName = teamName;
    }

    @Override
    public double getSalary() {
        double salary = 0.0;
        if(expYear < 4) {
            return salary = baseSalary;
        } else {
            if(expYear >= 4 && expYear <= 7) {
                return salary = baseSalary + 0.04 * baseSalary;
            } else {
                if(expYear >= 8 && expYear <= 10) {
                    return salary = baseSalary + 0.08 * baseSalary;
                } else {
                    if(expYear >= 11) {
                        return salary = baseSalary + 0.12 * baseSalary;
                    }
                }
            }
        }
        return salary;
    }

    @Override
    public developer copy() {
        developer developer = new developer(id, name, age, baseSalary, expYear, teamName);
        return developer;
    }

    @Override
    public void printInformation() {
        System.out.printf("Developer[id = %d, name = %s, age = %d, Base Salary = %d, EXP Year = %d, team name = %s]\n", id, name, age, baseSalary, expYear, teamName);
    }
}
