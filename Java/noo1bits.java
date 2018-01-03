//number of 1 bits in an integer

public static int solver(int n){
	//shift it 32/64 times based on the machine
	//to count each time whether 
	int ctr = 0;
	for (int i = 0; i < 32; i++){
		//no if required
		ctr += n&1;
		//no signs needed to be considered
		n >>>=1;
	}
	return ctr;
}