package pl.ttpsc.solid.lsp.shape;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calcCircumference() {
        return 2.0 * Math.PI * r;
    }

    @Override
    public double calcArea() {
        return Math.PI * r * r;
    }
}
