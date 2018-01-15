//regular expression matching

class solution{
	public static boolean isMatch(final String s, final String p){
		return isMatch(final String s, int i, String p, int j);
	}
	public static boolean matchFirst(String s, int i , String p, int j){
		//guessing this is checking if everything is pointed at the end?
		if(j==p.length()) return i==s.length();
		if(i==s.length()) return j==p.length();
		//if not at the end, check if pattern at loc j is '.' or p[j]==s[i]
		return (p.charAt(j)=='.'||p.charAt(j) == s.charAt(i));
	}
	public static boolean isMatch(String s, int i, String p, int j){
		if(j==p.length()) return i == s.length();
		//check next char '*', then match with current char
		final char b = p.charAt(j);
		if (j==p.length()-1 || p.charAt(j+1) != '*'){
			if(matchFirst(s,i,p,j)) return isMatch(s,i+1,p,j+1);
			else return false;
		} else {
			if(isMatch(s,i,p,j+2)) return true;
			while(matchFirst(s,i,p,j)){
				if(isMatch(s,++i,p,j+2)) return true;
			}
			return false;
		}
	}
}