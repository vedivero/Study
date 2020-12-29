package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hankook.Tire;
import sec12.exam03_import.hyundai.*;
import sec12.exam03_import.kumho.*;

//구체적으로 Class file이름 까지 적어주면 되지만
//import sec12.exam03_import.hyundai.Engine;

//'*'를 사용하면 해당 package에 있는 모든 Class를 사용가능

public class Car {
	
	Engine engine = new Engine();
	
	SnowTire tire1 = new SnowTire();
	
	BigWidthTire tire2 = new BigWidthTire();
	
	Tire tire3 = new Tire();	//The type Tire is ambiguous
	

	//다른 package의 동일한 class 2개를 모두 사용할 경우, package를 명시해서 생성해준다
	sec12.exam03_import.hankook.Tire tire = new sec12.exam03_import.hankook.Tire();
	
}
