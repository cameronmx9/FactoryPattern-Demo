package factoryPattern;

public class FactoryPatternDemo {
	
	public static void main(String[] args){
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get an object of Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		//call draw method of Circle
		shape1.draw();
		
		//get an object of Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
				
		//call draw method of Rectangle
		shape2.draw();
		
		//get an object of Square
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}

}
