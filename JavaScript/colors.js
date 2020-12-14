
	var Links = {
		   setColor:function(color){
	//			var alist = document.querySelectorAll('a');
	//			var i = 0;
	//				while(i < alist.length){
	//				    alist[i].style.color=color;
	//			    	i = i + 1 ;
	//				}
		   	$('a').css('color',color)
		 }
	}
   
	var Body = {
		setColor:function(color){
			//document.querySelector('body').style.color = color;
			$('body').css('color',color)
		},		//객체의 property와 property를 구분할 때, ( , )콤마를 사용
		setBackgroundColor:function(color){
			//document.querySelector('body').style.backgroundColor = color;
			$('body').css('backgroundColor',color)
		} 
	}
	
	function nightDayHandler(self){
			
 		var target = document.querySelector('body');
 	
 		if(self.value ==='night'){
 			Body.setBackgroundColor('black');
 			Body.setColor('white');
  		
 			self.value = 'day';
	
  			Links.setColor('red');
 	
 		}else{
 			
 			Body.setBackgroundColor('white');
 			Body.setColor('black');
  			
 			self.value = 'night';
  	
	  		var alist = document.querySelectorAll('a');
			var i = 0;
			
			while(i < alist.length){
			    alist[i].style.color='blue';
			    i = i + 1;
			}
  		}
 	 }
