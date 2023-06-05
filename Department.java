// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your c
public abstract class Department {
    public abstract int getDepartmentSize();

}
class subDepartment extends Department{
    int size=100;
    public int getDepartmentSize(){
        return size;
    }
}
