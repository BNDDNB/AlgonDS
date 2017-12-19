//D&C method for implementing power function

public class Powerfunctiondc {

    public static double power(double x, int y){
        //divide and conquer method
        //base case when power term is 0, then return 1, otherwise
        //divide the power until it could multiply the x values itself
        if (y == 0) return 1;
        double temp = power(x,y/2);
        if(y%2==0) return temp * temp;
        else return temp*temp * x;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}