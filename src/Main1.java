public class Main1
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(6.9,4.20);
        Rectangle r2 = new Rectangle(0.16, 1.0);
        r2.setLength(r2.getLength()/4);
        r2.setWidth(r2.getWidth()*4);
        System.out.println(r2.toString());
        System.out.println("the area of the rectangle is: " + r2.area());
        System.out.println();
    }
}
