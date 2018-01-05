//needle in hay prob
//bruteforce method
public static int solver(String n, String h){
	//base?
	if (n.length == 0 || h.length == 0){
		return 0;
	}

	int nlen = n.length();
	int hlen = h.length();
	
	for (int i = 0; i < hlen - nlen+1;i++){
		int k = 0;
		while (k<nlen && n.charAt(k) == h.charAt(i+k)){
			k++;
		}
		if (k == nlen) return i;
	}
	//not found?
	return -1;
}

//to add KMP or boyer-moore