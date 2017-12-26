//maximal rectangle that covers the largest region of
//1s in a 2d matrix

//initial thought is to use BFS/DFS to scan through the
//matrix, while using another empty matrix to record visited spaces
//however, this method is not going to end up with just rectangle
//e.g. if two rectangular areas of 1s touches on the edge, then 
//an irregular shape will also be caught by the B/DFS

//since the matrix only contains 1s and 0s, sum of all 1s in area
//will be the area of rectangle, recording hight and length to obtain
//maximal area

public static int maxArea(int [][] mtx){
	int m = mtx.length;
	int n = mtx[0].length;
	int result = 0;
	if (m == 0 || n == 0){
		return result;
	}
	
	//here records at each column, the longest heights
	//width that can be found, width are represented as
	//right index - left index
	
	int [] hight = new int [n];
	int [] leftm = new int [n];
	int [] rightm = new int [n];

	//intialize all the right value to 

	for(int i = 0; i < m; i++){
		int l = 0, r = n;
		for (int j = 0; j<n; j++){
			if(mtx[i][j]==1){
				height[j]++;
				leftm [j] = Math.max(l,leftm[j]);
			}else{
				//j+1 here because of the next j value after this
				l = j+1;
				//since its not 1 anymore, reset corresponding height 
				//and left coordinates
				height[j]=0;
				leftm[j]=0;
				rightm[j]=n;
			}
		}
		for (int j = n-1; j >=0; j++){
			if (mtx[i][j]==1){
				rightm[j] = Math.min(rightm[j],r);
				result = Math.max(result, height[j]*(rightm[j]-leftm[j]));
			}else{
				//this is because of the 1 diff in the width
				right = j;
			}
		}
	}
	return result;
}