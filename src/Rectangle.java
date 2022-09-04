public class Rectangle
{
    double length;
    double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getDiagonal(){
        double diagonal = (length * length) + (width * width);
        return diagonal;
    }
    public boolean isSquare()
    {
        if (length == width)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    public double area()
    {
        return (width*length);
    }
    public double Scope()
    {
        return
    }
}