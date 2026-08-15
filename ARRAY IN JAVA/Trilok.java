import java.util.*;

public class Trilok{
    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    String names[] = new String[size];
    for(int i=0; i<size; i++){
        names[i] = sc.next();
    }

    String x = sc.next();
    for(int i=0; i<names.length; i++){
        if(names[i].equals(x)){
           System.out.println( "found at index:"+i);
        }
      }
    }
}