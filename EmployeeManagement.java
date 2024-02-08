package Java.javacore;

// import java.util.ArrayList;

public class EmployeeManagement implements IBasicManagement,IDataManagement {
    
    // private ArrayList <employee> employeeList = new ArrayList<>();

    // private String fileOpen = "D:\\Visual Studio Code\\Java\\javacore\\List.txt";

    public EmployeeManagement() {

    }

    @Override
    public boolean loadDataFromFile(String pathFile) {
        //
        return true;
    }

    @Override
    public boolean saveDataToCurrentFile() {
        //
        return true;
    }

    @Override
    public boolean saveDataAs(String pathFile) {
        //
        return true;
    }

    @Override
    public boolean create(employee e) {
        //
        return true;
    }

    @Override
    public employee getByID(int ID) {
        //
        return getByID(ID);
    }

    @Override
    public boolean update(employee e) {
        //
        return true;
    }

    @Override
    public employee deleteByID(int ID) {
        // 
        return getByID(ID);
    }

    @Override
    public void showAll() {
        //
        
    }

}
