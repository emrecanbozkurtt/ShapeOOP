package deneme;

public class Test {

	public static void main(String[] args) {
		
Shape[] objects=new Shape[3];
		
		objects[0]=new Triangle(5, 14);
		objects[1]=new Circle(3);
		objects[2]=new Square(9);
		
		for (Shape r:objects)
		{
			System.out.println(r);
			
		
//			if(r instanceof TwoDimensionalShape)
//			{
//				
//				TwoDimensionalShape z= (TwoDimensionalShape) r;
//				System.out.println("Area:"+z.getArea());
//				//System.out.println(((TwoDimensionalShape) r).getArea());
//				
//			}
//			
//			else 
//			{
//				
//			}
		
		}
		
	

	}

}
