import java.util.*; 
public class todoapp {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Please Enter Your request");
        int req = sc.nextInt();
        int arr[] = {};
        while(true){
            if(req.equals('quit')){
                System.out.println("Quitting App");
                break;
            }
            if(req.equals('list')){
                System.out.println();
            }
        }

    }
}