package pl.ttpsc.solid.lsp.shape;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcCircumference() {
        return 2.0 * (a + b);
    }

    @Override
    public double calcArea() {
        return a * b;
    }
}
