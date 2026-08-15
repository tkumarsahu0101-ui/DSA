import java.util.Scanner;

public class BitToggle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int poss = sc.nextInt();

        int bitMask = 1<<poss;

        int newNumbers = num^bitMask;

        System.out.println("origional number:"+num+("binary :"+ Integer.toBinaryString(num)));

        System.out.println("Toggle number:"+newNumbers+"of"+("Binary:"+Integer.toBinaryString(newNumbers)));


    }
}