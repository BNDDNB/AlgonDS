//finding repeated string sequence with length of 10
//way to do it is to fix sliding and use hash to record number
//of times each pattern repeats itself

public static List<String> solver(String in){
	//For improvements, add the 
	if(in.length() <= 10){
		return null;
	}
	HashMap <String> hmp = new HashMap<>();
	int wlen = 10;
	for (int i = 0; i < in.length-wlen+1; i++){
		String temp = in.substring(i,i+10);
		//this function getOrDefault will give either a key or a defaulted value
		//originally I used if to prevent error
		int curctr = hmp.getOrDefault(temp, 0);
		//hash put/add difference:

		hmp.put(temp, curctr+1);
	}
	//check all entries to the loop
	List <String> result = new List<>();
	for(Map.Entry<String,Integer>entry : hmp.entrySet()){
		if (entry.getValue()>=2){
			result.add(entry.getKey());
		}
	}
	return result;
}