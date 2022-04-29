import java.util.Random;
public class Random_Number
{
    Random Rand = new Random();
    private int Range_Number_Max;
    private int Range_Number_Min;


    public Random_Number()
    {
    }
    public Random_Number(int Range_Number_Max, int Range_Number_Min)
    {
        this.Range_Number_Max = Range_Number_Max + 1;
        this.Range_Number_Min = Range_Number_Min;
    }


    public int Generate_Random()
    {
        return Rand.nextInt(Range_Number_Max-Range_Number_Min) + Range_Number_Min;
    }


    public int getRange_Number_Max()
    {
        return Range_Number_Max;
    }
    public int getRange_Number_Min()
    {
        return Range_Number_Min;
    }


    public void setRange_Number_Max(int Range_Number_Max)
    {
        this.Range_Number_Max = Range_Number_Max;
    }

    public void setRange_Number_Min(int range_Number_Min)
    {
        Range_Number_Min = range_Number_Min;
    }
}