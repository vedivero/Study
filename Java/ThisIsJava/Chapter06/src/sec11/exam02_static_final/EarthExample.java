package sec11.exam02_static_final;

public class EarthExample {

	public static void main(String[] args) {

		System.out.println("지구의 반지름 :"+Earth.EARTH_RADIUS+"km");	
						//EARTH_RADIUS는 static이기 때문에 class.으로 접근
		
		System.out.println("지구의 표면적 :"+Earth.EARTH_SURFACE_AREA+"km");
	}
	
}
