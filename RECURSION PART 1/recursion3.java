public class recursion3 {

    public static void main(String args[]){

        int n = 10;

        printSum(10, 1, 0);
    
    }

    public static void printSum(int n,int i, int sum){

        if(i==n){
         
            sum += i;

            System.out.println(sum);

            return;
            


            }

        sum = sum + i;

        printSum(n, i+1, sum);
    }
}