package deneme;

public class Square extends TwoDimensionalShape {
	
private int height;
	
	public Square(int height)
	{
		setHeight(height);
	}
	

	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height>0?height:0;
	}


	@Override
	public double getArea() {		
		return Math.pow(height, 2);
	}
	
	@Override
	public String toString() {		
		return super.toString()+"\tHeight:"+getHeight()+"\tArea:"+getArea();
	}

}
