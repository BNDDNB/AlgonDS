public class Jumpgame {
//this version tries each possible jump recursively,
//since trying from the base first, it has slow run time
//trying from max jump can help better sloving

    public static boolean solver(int [] arr, int indx){
        if (indx >= arr.length -1){
            return true;
        }else if (arr[indx] == 0 && indx < arr.length - 1){
            return false;
        }
        for (int i = 1; i <= arr[indx]; i++){
            if (solver(arr,indx+i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
	    // write your code here
        //Scanner sc = new Scanner(System.in);
        int [] arr = {2,3,1,1,4};
        int [] arr2 = {3,2,1,0,4};
        System.out.println(solver(arr2, 0));
    }

}