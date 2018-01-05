//valid palindrom that does not consider non-alphaneumeric
//e.g. a$a is considered palindrom a$%a is as well
//can erase all non-alphaneumeric first and then check for palin

public static boolean solver(String s){
	int slen = s.length();
	//base here is covered by while or for
	if (slen == 0 ){
		return true;
	}
	int l = 0;
	int r = slen;
	//while or for to half
	while (l<r){
		if(!Character.isLetterOrDigit(s.charAt(l))) l++;
		else if(!Character.isLetterOrDigit(s.charAt(r)))r--;
		else if(s.charAt(l)!=s.charAt(r)) return false;
		else{r--;l++;}
	}
	//if everything passes
	return true;
}