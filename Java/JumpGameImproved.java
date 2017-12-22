public class JumpGameImproved {

    public static boolean solver(int [] num){
        int reach = 1;
        for (int i = 0; i < reach && reach < num.length ; i++){
            reach = Math.max(reach, i+1+num[i]);
        }
        return reach >= num.length;
    }

    public static void main(String[] args) {
	    // write your code here
        //Scanner sc = new Scanner(System.in);
        int [] arr = {2,3,1,1,4};
        int [] arr2 = {3,2,1,0,4};
        System.out.println(solver(arr2));
    }
}