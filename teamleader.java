package Java.javacore;

public class teamleader extends developer{
    
    public double bonusRate;

    public teamleader() {

    }

    public teamleader(int id, String name, int age, int baseSalary, int expYear, String teamName, double bonusRate) {
        super(id, name, age, baseSalary, expYear, teamName);
        this.bonusRate = bonusRate;
    }

    @Override
    public double getSalary() {
        double salary = 0.0;
        salary = baseSalary + bonusRate * baseSalary;
        return salary;
    }

    @Override
    public teamleader copy() {
        teamleader teamleader = new teamleader(id, name, age, baseSalary, expYear, teamName, bonusRate);
        return teamleader;
    }

    @Override
    public void printInformation() {
        System.out.printf("Team Leader[id = %d, name = %s, age = %d, Base Salary = %d, EXP Year = %d, team name = %s, Bonus Rate = %.2f]\n", id, name, age, baseSalary, expYear, teamName, bonusRate);
    }
}
