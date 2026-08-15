public class clearbits {

  public static void main(String[] args) {
    
    int no = 5;
    int pos = 3;


    int bitMask = 1<<pos;

    int newNumbers = ~(bitMask);
    
    int newNumbers1 = newNumbers&no;

    System.out.println(newNumbers1);
    
  }
}