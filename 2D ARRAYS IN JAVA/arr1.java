import java.util.*;
public class arr1{
    public static void search(int arr[][] , int  key){
        int maxV = Integer.MIN_VALUE;
        int minV = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                // if(arr[i][j] == key){
                //    System.out.println("key  found at indedx: "+i+","+j);
                //     return true;
                // }
                if(arr[i][j] > maxV){
                    maxV = arr[i][j];
                }
                if(arr[i][j] < minV){
                    minV = arr[i][j];
                }
            }
        }
        System.out.println("max value is:"+ maxV);
        System.out.println("min value is:"+ minV);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int n = arr.length; int m = arr[0].length;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr, 5);
   }
 }
