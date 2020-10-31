package Task1;

public class Data
{
    long inn;
    String name;
    public Data(long inn, String name) throws NumbersOfINN
    {
        checkINN(inn);
        check(inn,name);
        this.inn = inn;
        this.name = name;
    }
    public long getInn()
    {
        return inn;
    }
    public String getName()
    {
        return name;
    }
    private void checkINN(long inn) throws NumbersOfINN
    {
        double num = Math.ceil(Math.log10(inn));
        if (num != 12)
            throw new NumbersOfINN("Номер ИНН введен неверно");
    }
    private void check(long inn, String name) throws NumbersOfINN
    {
        if (inn==this.getInn() || name==this.getName())
            throw new NumbersOfINN("Данный ИНН недействителен для клиента.\n "+name);
    }
    @Override
    public String toString()
    {
        return "ИНН: " + this.inn + "\t ИМЯ: " + this.name;
    }
}
