package vn.codegym.QuyenLeSy;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public	double	getArea(){ return	Math.PI	*	this.radius	*	this.radius; }
    public	double	getPerimeter(){ return	Math.PI	*	2	*	this.radius; }

    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", color: "
                + getColor()
                + ", Area = "
                + getArea();
    }
}
