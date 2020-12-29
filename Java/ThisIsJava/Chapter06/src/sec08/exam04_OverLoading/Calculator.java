package sec08.exam04_OverLoading;

public class Calculator {

	//정사각형의 넓이를 구하는 method
	double areaRectangle(double width){
		
		return width*width;
	}
	
	//직사각형의 넓이를 구하는 method
	double areaRectangle(double width, double height){
		
		return width * height;
	}
	
}
