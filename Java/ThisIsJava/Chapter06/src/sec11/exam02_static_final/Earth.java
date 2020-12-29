package sec11.exam02_static_final;

public class Earth {

	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;	//지구 표면적은 단순히 값을 입력할 수 없어 선언만
											//초기화가 되지 않아 error가 출력되고 있다.
	
	static{
		
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
	}
}
