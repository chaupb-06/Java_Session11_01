package bt01;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("HCN0101", 12.3, 14.9);
        shapes[1] = new Circle("HT0102", 8.9);
        for (Shape s : shapes) {
            s.displayInfo();
            System.out.println("Diện tích: " + String.format("%.2f", s.getArea()));
            System.out.println("Chu vi: " + String.format("%.2f", s.getPerimeter()));
            if (s instanceof Drawable) {
                ((Drawable) s).draw();
            }
        }
    }
}
