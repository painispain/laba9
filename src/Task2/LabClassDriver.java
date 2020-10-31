package Task2;

public class LabClassDriver {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException
    {
        LabClassUI labClassUI = new LabClass();
        labClassUI.addStudent(6, "Фролов",4.3);
        labClassUI.addStudent(9, "Синотов",4.5);
        labClassUI.addStudent(1, "Мюллер", 5.0);
        labClassUI.addStudent(2, "Пугачем",3.9);
        labClassUI.addStudent(3, "Ленин", 4.9);
        System.out.println("\nНесортированный список студентов\n");
        labClassUI.printOutStudents();
        labClassUI.sortByGPA();
        System.out.println("\nОтсортированный список студентов\n");
        labClassUI.printOutStudents();
        System.out.println("\nПоиск студента по имени");
        System.out.println(labClassUI.searchByName("Фролов")+"\n");
    }
}