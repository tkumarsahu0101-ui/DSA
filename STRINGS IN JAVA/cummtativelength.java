import java.util.Scanner;

public class cummtativelength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int totlenght = 0;
        
        String array[] = new String[size];

        for(int i=0; i<size; i++){

            array[i] = sc.next();

            totlenght += array[i].length();

            System.out.println(totlenght);

        }
    }
}
