//Bits operations that flips a bit representation
//the the original representation and flipped representation
//should be converted back to integer format

public static int solver(int ori){
	int result = 0;
	for (int i = 0 ; i < 32; i++){
		//if last bit is 1, then append 1 at the result and push it to the left
		if((ori & 1) == 1){
			result = result <<1 +1;
		}else{
			result = result <<1;
		}
		//getting next bits
		ori >>1;
	}
	return result
}
