public class prac2 {
    public static void main(String[] args) {
        int Arr[][] = {
               {1,4,9},
               {11,4,3},
               {2,2,3} 
        };
        System.out.println(printSumOf2ndrow(Arr));
    }
    public static int printSumOf2ndrow(int Arr[][]){
        int sum = 0;    
        int i = 1;
            for(int j = 0; j<Arr[0].length; j++){
                
                sum += Arr[i][j];
            }
        
        return sum;
       
    }
}
