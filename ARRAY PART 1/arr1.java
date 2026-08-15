import java.util.*;

public class arr1 {
    public static void main(String[] args) {

        // input in Array
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy="+marks[0]);
        System.out.println("che="+marks[1]);
        System.out.println("maths="+marks[2]);

        marks[1] = 99;

        System.out.println("che="+marks[1]);
        marks[1] = marks[1] + 1;
         
        System.out.println("che="+marks[1]);


        float percented = (marks[0] + marks[1] + marks[2])/3;

        System.out.println(percented);

        System.out.println(marks.length);
       
    }
}
