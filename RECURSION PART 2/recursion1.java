public class recursion1 {

    public static void main(String[] args) {

        int n=3;

        towerHanoi(n, "S", "H", "D");

        
    }
    public static void towerHanoi(int n,String Src,String Helper,String Dest){
        if(n==1){

            System.out.println("Tranfer disk:"+n+" from "+Src+" to "+Dest);

            return;
        }
        towerHanoi(n-1, Src, Dest, Helper);

        System.out.println("Tranfer disk:"+n+" from "+Src+" to "+Dest);

        towerHanoi(n-1, Helper, Src, Dest);
      }


    }

      
        
    

