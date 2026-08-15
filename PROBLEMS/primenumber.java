import java.util.*;

class primenumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size  = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();


        }

        int x = sc.nextInt();

        for(int j=0; j<numbers.length; j++){
            if(numbers[j] == x){
                System.out.println("'x' found at index :" + j);
            }
            
        }

    }
    
    
}