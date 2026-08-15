import java.util.*;
public class arr9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String fruits[] = {"Mango","Apple","Banana","Coconut","DragonFruits"};
    for(int i = 0; i<fruits.length; i++){
        System.out.print(fruits[i]+" ");
    }
    System.out.println("\n Select fruit:");
    String key = sc.next();
    linearSearchStr(fruits, key);
    }
    public static void linearSearchStr(String fruits[],String key){

        for(int i = 0; i<fruits.length; i++){
            if(fruits[i].equals(key)){
                System.out.println(fruits[i]+" found at index "+i);
            }
        }
    }
}
