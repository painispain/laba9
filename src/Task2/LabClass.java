package Task2;

import java.util.*;
import java.lang.*;

public class LabClass implements LabClassUI
{
    ArrayList<Student> students;
    public LabClass()
    {
        students = new ArrayList<>();
    }
    @Override
    public void sortByGPA()
    {
        for (int i = 1; i < students.size(); i++)
        {
            Student temp = students.get(i);
            int j = i - 1;
            while (j > -1 && students.get(j).compareTo(temp) > 0)
            {
                Collections.swap(students, j + 1, j);
                j--;
            }
        }
    }
    @Override
    public Student searchByName(String name) throws StudentNotFoundException
    {
        for (Student s : students)
        {
            if (s.getName().equals(name))
            {
                System.out.println("Студент найден \nВ Информация о нем:");
                return s;
            }
        }
        throw new StudentNotFoundException("Нет ученика с именем\n " + name + " в базе :(");
    }
    @Override
    public void printOutStudents()
    {
        for (Object o : students)
        {
            System.out.println(o);
        }
    }
    @Override
    public void addStudent(Integer ID, String name, Double grade) throws EmptyStringException
    {
        Student student = new Student(ID, name, grade);
        students.add(student);
    }
}