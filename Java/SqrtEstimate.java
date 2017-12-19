//using the binary method to find value of sqrt


public class SqrtEstimate {

    public static int sqrtCalc(int val){
        int left, right, mid;
        left = 1;
        right = val;
        mid = left + (right - left) / 2;
        //String debugger = "";

        //binary searching method to get value of
        if (val <=2) return right;
        while (left <= right) {
            //debugger = String.format("Three numbers: %d, %d, %d", left, mid, right);
            //System.out.println(debugger);
            mid = left + (right - left) / 2;
            if (val / mid < mid){
                right = mid -1;
            }else if (val / mid > mid){
                left = mid + 1;
            }else{
                break;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = 9;
        System.out.println(sqrtCalc(a));
    }
}