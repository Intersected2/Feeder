public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(4000);
        System.out.println(f);
        System.out.println((int) ((Math.random()*41 + 10)));
        f.simulateOneDay(22);
        //System.out.println(Math.random() < 0.05);
        System.out.println(f.simulateManyDays(10, 4) + " days");
        System.out.println(f.simulateManyDays(10,5) + " days");
        System.out.println(f.simulateManyDays(5,10) + " days");
        System.out.println(f.getCurrentFood());
    }
}
