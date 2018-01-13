//longest common prefix
//can be scanned horizontally or vertically depending on 
//this implements the vertical scanning

public static String solver(String [] ss){
	if (ss.length == 0){return "";}
	for (int j = 0; j < ss[0].length(); j++){
		String tmp = ss[0].charAt(j);
		for(int i = 0; i < ss.length; i++){
			if(ss[i].length() == j || ss[i].charAt(j)!=tmp){return ss[i].substring(0,j);}
		}
	}
	//this is equivalent of the 0th string being the shortest
	return str[0];
}