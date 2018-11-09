object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
  	var sum = 0;

	for (a <- 1 until limit){
   			if (factors.exists(a % _ == 0)){
   				sum = sum + a
   			} 
   	}

   	sum
   		
	}
  
}
