import java.util.Random;
public class Random_Number
{
    private int Range_Number;
    Random Rand = new Random(Range_Number+1);

    public Random_Number(int Range_Number) {
        this.Range_Number = Range_Number;
    }
}