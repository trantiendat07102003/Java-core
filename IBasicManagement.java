package Java.javacore;

public interface IBasicManagement {

    public abstract boolean create(employee e);
    public abstract employee getByID(int ID);
    public abstract boolean update(employee e);
    public abstract employee deleteByID(int ID);
    public abstract void showAll();

    
}
