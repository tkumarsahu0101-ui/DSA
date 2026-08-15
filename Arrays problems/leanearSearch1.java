import java.util.*;
public class leanearSearch1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int a [] = new int[size];

        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        int x  = sc.nextInt();

        int idx = -1; 

        for(int i=0; i<a.length; i++){
            if(a[i] == x){
                idx = i; 
                break;
            }
        }
        System.out.println(idx);
    }
}
