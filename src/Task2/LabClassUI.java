package Task2;

public interface LabClassUI
{
    void sortByGPA();
    Student searchByName(String name) throws StudentNotFoundException;
    void printOutStudents();
    void addStudent(Integer ID, String name, Double grade) throws EmptyStringException;
}