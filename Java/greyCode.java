//bitwise operation on getting grey code
//provide with the length of array required
//this uses mathematical method that does xor of 
public static List<Integer> solver(int n){
	//total number of elements 
	int numof = 1<<n;
	List <Integer> result = new List<>();
	for (int i = 0; i < numof; i++ ){
		result.add(proc(i));
	}
	return result;
}
public static int proc(int n){
	return n^(n>>1);
}