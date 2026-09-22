import java.util.Scanner;
interface Motor
{
    int capacity = 9;
    void run();
    void consume();
}
class WashingMachine implements Motor
{
    public void run()
    {
        System.out.println("Motor is runing");
    }
    public void consume()
    {
        System.out.println("Motor is consuming power");
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        System.out.println("Capacity of Motor is: " + Motor.capacity);
        sc.close();
    }

}