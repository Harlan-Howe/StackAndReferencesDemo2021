public class DemoRunner
{

    public static void main(String[] args)
    {
        TwoCoordinates p = new TwoCoordinates(10,15);
        int x = 5;
        String greeting = "Hello.";

        System.out.println("Start of main: x = "+x+"; greeting = \""+greeting+"\" and p = "+p);
        foo(x,greeting, p);
        System.out.println("End of main: x = "+x+"; greeting = \""+greeting+"\" and p = "+p);

    }

    public static void foo( int x, String s, TwoCoordinates point)
    {
        System.out.println("\tStart of foo: x = "+x+"; s = \""+s+"\" and point = "+point);
        x = 10;
        s = "Howdy!";
        point.setY(9000);
        bar(x,s,point);
        System.out.println("\tEnd of foo: x = "+x+"; s = \""+s+"\" and point = "+point);

    }

    public static int bar ( int y, String s, TwoCoordinates pointy)
    {
        System.out.println("\t\tStart of bar: y = "+y+"; s = \""+s+"\" and pointy = "+pointy);
        pointy.setX(100);
        pointy.setY(150);
        s = "¡Hola!";
        y = 10;
        System.out.println("\t\tEnd of bar: y = "+y+"; s = \""+s+"\" and pointy = "+pointy);

        return 3*y;
    }

}
