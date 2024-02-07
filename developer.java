package Java.javacore;

public class developer extends employee {
    
    private int expYear;
    private String teamName;

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

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
            return salary = getBaseSalary();
        } else {
            if(expYear >= 4 && expYear <= 7) {
                return salary = getBaseSalary() + 0.04 * getBaseSalary();
            } else {
                if(expYear >= 8 && expYear <= 10) {
                    return salary = getBaseSalary() + 0.08 * getBaseSalary();
                } else {
                    if(expYear >= 11) {
                        return salary = getBaseSalary() + 0.12 * getBaseSalary();
                    }
                }
            }
        }
        return salary;
    }

    @Override
    public developer copy() {
        developer developer = new developer(getId(), getName(), getAge(), getBaseSalary(), getExpYear(), getTeamName());
        return developer;
    }

    // @Override
    // public void printInformation() {
    //     System.out.printf("Developer[id = %d, name = %s, age = %d, Base Salary = %d, EXP Year = %d, team name = %s]\n", id, name, age, baseSalary, expYear, teamName);
    // }

    @Override
    public String toString() {
        return super.toString();
    }
}
