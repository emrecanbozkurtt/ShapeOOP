package deneme;

public class Circle extends TwoDimensionalShape {

private int radius;
	
	public Circle(int radius)
	{
		setRadius(radius);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	@Override
	public double getArea() {
		
		return Math.PI*radius*radius;
	}
	
	@Override
	public String toString() {	
		return super.toString()+"\tRadius:"+getRadius();
	}
}
