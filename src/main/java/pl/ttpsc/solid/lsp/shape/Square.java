package pl.ttpsc.solid.lsp.shape;

public class Square implements Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calcCircumference() {
        return 4.0 * a;
    }

    @Override
    public double calcArea() {
        return a * a;
    }
}
