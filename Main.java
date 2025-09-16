public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(1000);
        System.out.println(f);
        System.out.println((int) ((Math.random()*41 + 10)));
        f.simulateOneDay(22);
        System.out.println(f.getCurrentFood());
        //System.out.println(Math.random() < 0.05);
    }
}
