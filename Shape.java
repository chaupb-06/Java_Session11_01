package bt01;

public abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    public void displayInfo() {
        System.out.println("Shape Name: " + name);
    }
}