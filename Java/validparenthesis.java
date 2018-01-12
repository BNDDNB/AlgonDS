//Valid Parentheses
//can put all parenthesis on to stack and then whenever seen one right half 
//that is the same as the left half on the stack, cancel them out

public static boolean solver(String s){
	//can set initial brackets into strings
	//and then check if their index matches
	if (s.length() == 0){return true;}
	Stack <String> stk = new Stack <>();
	for (int i = 0; i < s.length; i++){
		if (s.charAt(i) == "{"||"["||"("){
			stk.push(s.charAt(i));
		}else if(((s.charAt(i) == '{' && stk.peek() == '}')||
			(s.charAt(i)=='[' && stk.peek() == ']')||
			(s.charAt(i)=='(' && stk.peek()== ')'))&& !stk.isEmpty()){
			stk.pop();
		}else{
			return false;
		}
	}
	//cannot directly return true as the stack may not be balanced out
	return stk.isEmpty();
}