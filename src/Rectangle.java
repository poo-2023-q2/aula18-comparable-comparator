public class Rectangle implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        this.width = width;
    }

    public double getHeight() {
        if (height < 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public int compareTo(Rectangle rectangle) {
        return Double.compare(this.area(), rectangle.area());
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(10,20);
        Rectangle b = new Rectangle(20, 10);
        // Rectangle c = new Rectangle(10,10);

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(b));
    }
}
