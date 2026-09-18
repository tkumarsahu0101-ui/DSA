import java.util.*;
public class str1 {
    public static void printLatter(String fullName){
        for(int i = 0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Strings Are Immutable

        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String name = sc.nextLine();

        // System.out.println(name);

        // String fullname = "Tony Stark";
        // length find out
        // System.out.println(fullname.length());

        // concatination

        String firstName = "Trilok";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
        printLatter(fullName);
    }
}
