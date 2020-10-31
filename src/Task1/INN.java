package Task1;

import java.util.ArrayList;
import java.lang.*;

public class INN
{
    ArrayList<Data> inn;
    public INN()
    {
        inn = new ArrayList<>();
    }

    public void Add(Data data) throws UniqueINN
    {
        Check(data.getInn(), data.getName());
        inn.add(data);
    }

    private void Check(long i, String name) throws UniqueINN
    {
        for (Data d : inn)
        {
            if (d.getName().equals(name)||d.getInn()==i)
            {
                throw new UniqueINN("Этот ИНН уже есть в базе\n." +
                        "\nНе действует для клиента "+name);
            }
        }
    }

    public void Print()
    {
        for(Object i: inn) {
            System.out.println(i);
        }
    }
}