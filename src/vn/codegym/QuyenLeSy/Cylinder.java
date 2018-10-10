package vn.codegym.QuyenLeSy;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color){
        super(radius, color);
    }

    public void setHeight(double height){
        height = height;
    }

    public double getHeight(){
        return this.height;
    }

    @Override

    public	double	getArea()	{ return	super.getArea()	*	2	+	super.getPerimeter()	*	height; }
    public	double	getVolume(){ return	super.getArea()	*	this.height; }
    public String toString(){
        return "A Cylinder with radius="
                + getRadius()
                + ", color: "
                + getColor()
                + ", Area = "
                + getArea()
                + ", Volume = "
                + getVolume();
    }


}
