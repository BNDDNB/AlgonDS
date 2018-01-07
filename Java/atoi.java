//implementation of atoi
//consider when no numbers are entered
	//consider invalid, unless hexa
//when numbers are entered
	//this consider the case when numbers are too big or small
	//all number strings are considered positive numbers
//when numbers and non-numbers are entered
	//this could be valid, "+123", "-123", ""
	//could also be invalid "++1", "--4"
//the function will always return a value, so if the input value is invalid
//the return will be 0. will return the value of what it could convert
public static int atoii(String s){
	int result = 0;
	int mult = 1;
	int slen = s.length();
	if (slen == 0){
		return 0;
	}
	//add case for many white spaces
	int i = 0;
	while(i < slen && s.charAt(i) == ' '){i++;}
	//after whitespace, +/- are only allowed at the 
	if (s.charAt(i) == "-"){mult = -1;}
	i++;

	for(;i < slen; i++){
		//base for return result 
		if (s.charAt(i)<'0' || s.charAt(i)>'9') break;
		//check for overflow, and keeping at max/min
		if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE/10 &&
			(s.charAt(i) -'0')>Integer.MAX_VALUE%10)){
				return (mult==-1)? Integer.MIN_VALUE:Integer.MAX_VALUE
		}
		result = result * 10 + (s.charAt(i) - '0');
	}
	return result*mult;
}