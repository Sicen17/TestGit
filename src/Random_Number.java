import java.util.Random;
public class Random_Number
{
    private int Range_Number;
    Random Rand = new Random(Range_Number+1);


    public Random_Number(int Range_Number)
    {
        this.Range_Number = Range_Number;
    }


    public int getRange_Number()
    {
        return Range_Number;
    }


    public void setRange_Number(int range_Number)
    {
        Range_Number = range_Number;
    }
}