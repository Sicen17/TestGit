public class Subtract
{
    private int Number_0;
    private int Number_1;


    public Subtract(int Number_0, int Number_1)
    {
        this.Number_0 = Number_0;
        this.Number_1 = Number_1;
    }


    public int Subtract_Operation()
    {
        return Number_0 / Number_1;
    }


    public int getNumber_0()
    {
        return Number_0;
    }
    public int getNumber_1()
    {
        return Number_1;
    }


    public void setNumber_0(int number_0)
    {
        Number_0 = number_0;
    }
    public void setNumber_1(int number_1)
    {
        Number_1 = number_1;
    }
}
