import java.util.*;

public class leanearSearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your array of size");
        int size = sc.nextInt();
        
        int arr [] = new int [size];


        for(int i = 0; i<size; i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Enter your element");
        int num = sc.nextInt();
        boolean isfound = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                isfound = true;
                break;
        }
    }
     if(isfound){
            System.out.println("Element is found");

        }else{
            System.out.println("Element is not found");
        }
}
}