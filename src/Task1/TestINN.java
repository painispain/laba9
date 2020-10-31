package Task1;

import java.util.*;

public class TestINN
{
    public static void main(String[] args)
    {
        String name;
        long INN;
        Scanner scanner = new Scanner(System.in);
        INN test = new INN();
        Data data1 = new Data(200_324_594_234L, "Шматко");
        Data data2 = new Data(123_456_781_234L, "Синицин");
        Data data3 = new Data(534_267_182_531L, "Наруто");
        Data data4 = new Data(937_461_538_462L, "Евсеев");
        test.Add(data1);
        test.Add(data2);
        test.Add(data3);
        test.Add(data4);
        System.out.println("\nВывод базы данных");
        test.Print();
        System.out.println("\nПопытка добавить новые данные\nПример правильного ввода\n");
        System.out.println("ФИО: Стрыкало");
        System.out.println("Введите свой ИНН (состоит из 12 цифр):\t900_324_124_763L");
        Data data5 = new Data(900_324_124_763L, "Букин");
        test.Add(data5);
        System.out.println("База данных после добавления новых данных\n");
        test.Print();
        System.out.println("\nПример неверного ввода");
        System.out.println("ФИО: Рылов");
        System.out.println("Номер ИНН (состоит из 12 цифр)\n:\t900_324_124_763L");
        System.out.println("Если мы проверим этот случай, будет сгенерировано исключение");
        System.out.println("\nДобавьте свои данные");
        System.out.println("Напишите свое ФИО");
        name=scanner.nextLine();
        System.out.println("Введите свой ИНН (состоит из 12 цифр)");
        INN=scanner.nextLong();
        Data data7 = new Data(INN, name);
        test.Add(data7);
        test.Print();
    }
}
