public class prac3 {
    public static void main(String[] args) {
        printDigits(2005);
        
    }  
    public static void printDigits(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digit[lastDigit]+" ");

    }
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
}
