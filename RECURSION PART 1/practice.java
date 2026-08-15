public class practice {
    public static void main(String[] args) {
        // String str = "appnnacollege";
        int n = 4;
        System.out.println(dostpair(n));

        // System.out.println(tilingfloor(n));
      //  decreasing(n);
      //  increasing(n);
        // System.out.println(Fact(n));
        // System.out.println(Fib(n));
        // int arr[] = {2,3,4,5,7,5};
        // // System.out.println(isSorted(arr, 0));
        // int key = 5;
        // System.out.println(firstOcurrence(arr, key, 0));
        // System.out.println(power(2,5));
        // System.out.println(1%2);
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void decreasing(int n){
      if(n == 1){
        System.out.print(n);
        return ;
      }
      System.out.println(n);
      decreasing(n-1);
    } 
    public static void increasing(int n){
      if(n == 1){
        System.out.println(n);
        return ; 
      }
      increasing(n-1);
      System.out.println(n);
    }

    public static int Fact(int n){
      if(n == 1 || n == 0){
        return 1;
      }

      return n * Fact(n-1);
    }
    public static int sumOf(int n){
      if(n == 1){
        return 1;
      }
      int sum_nm1 = sumOf(n-1);
      int ts = n+sum_nm1;
      return ts;
    }

    public static int Fib(int n){
      if(n == 0 || n == 1){
        return n;

      }
      int f1 = Fib(n-1);
      int f2 = Fib(n-2);
      return f1+f2;
    }
    public static boolean isSorted(int arr[] , int i){
      if(arr[i] == arr.length-1){
        return true;
      }
      if(arr[i] > arr[i+1]){
        return false;
      }
      return isSorted(arr, i+1);
    }
    public static int firstOcurrence(int arr[] , int key,int i){

      // base case 
      if(arr[i] == arr.length){
        return -1;
      }
      if(arr[i] == key){
        return i;
      }
      return firstOcurrence(arr, key, i+1);
    }
    public static int lastOccurance(int arr[],int key,int i){
          if(i == arr.length){
            return -1;
          }
          int isfound = lastOccurance(arr, key, i+1);

          if(isfound == -1 && arr[i] == key){
            return i;
          }
          return isfound;
    }
    public static int power(int x,int n){
      if(x == 0){
        return 0;
      }
      if(n == 0){
        return 1;
      }
      if(n%2 == 0){
        return power(x, n/2)*power(x, n/2);
      }else{
        return power(x, n/2)*power(x, n/2)*x;
      }
    }
    public static int tilingfloor(int n){
      if(n == 0 || n == 1){
        return 1;
      }
      // vertical
      int vert = tilingfloor(n-1);
      // horizontal 
      int hori = tilingfloor(n-2);

      int tw = vert + hori;

      return tw;
    }
    public static void removeDuplicate(String str,int idx,StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
          System.out.println(newStr);
          return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar - 'a']  == true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
          map[currChar - 'a'] = true;
          removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static int dostpair(int n){
      if(n == 1 || n == 2){
        return n;
      }

      int fnm1 = dostpair(n-1);
      int fnm2 = dostpair(n-2);
      
      int pairWays = (n-1)*fnm2;

      int tp = fnm1 + pairWays;

      return tp;


    }
}
