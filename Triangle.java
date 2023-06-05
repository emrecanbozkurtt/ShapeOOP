package deneme;

public class Triangle extends TwoDimensionalShape {
	
private int base, height;
	
	public Triangle(int base, int height)
	{
		setBase(base);
		setHeight(height);
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base >0?base:0;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height>0?height:0;
	}

	@Override
	public double getArea() {		
		return (getBase()*getHeight())/2;
	}

	@Override
	public String toString() {		
		return super.toString()+"\tBase:"+base+"\tHeight:"+height+"\tArea:"+getArea();
	}
}
