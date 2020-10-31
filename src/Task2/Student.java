package Task2;

import java.lang.*;

public class Student implements Comparable<Student>
{
    int iDNumber;
    String name;
    double grade;
    public Student(int iDNumber, String name, double grade) throws EmptyStringException
    {
        if(name.isEmpty())
            throw new EmptyStringException("Имя не может быть пустой строкой\n");
        this.iDNumber = iDNumber;
        this.name = name;
        this.grade = grade;
    }
    public int getIDNumber()
    {
        return iDNumber;
    }
    public String getName()
    {
        return name;
    }
    public double getGrade()
    {
        return grade;
    }
    @Override
    public String toString()
    {
        return "ID: " + this.iDNumber + "\t Имя: " + this.name + "\t\tСредняя оценка: " + this.grade;
    }
    @Override
    public int compareTo(Student o)
    {
        if (this.getGrade() > o.getGrade())
            return -1;
        else if (this.getGrade() < o.getGrade())
            return 1;
        else
            return 0;
    }
}