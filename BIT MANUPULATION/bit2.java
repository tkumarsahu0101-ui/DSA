public class bit2 {
    public static void main(String[] args) {
        System.out.println(getIthBit(5, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(0, 0, 0));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15, 2));
        System.out.println(clearIBitsinRange(10 , 2 ,4));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(15));
        System.out.println(countSetBits(10));
        System.out.println(countSetBits(15));
        System.out.println(Fastexpo(5, 3));
    }
    // get Ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    // set Ith  bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i; 
        return n | bitMask;
    }
    // clear Ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }
    // update Ith Bit
    public static int updateIthBit(int n,int i,int newBit){
        // if(newBit == 0){
        //    return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        // # Another Approch ->

        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }
    // clear last i bits
    public static int clearIBits(int n,int i){
        int BitMask = (~0)<<i; 
        return n & BitMask;
    }
    // clear Bits in range
    public static int clearIBitsinRange(int n, int i , int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        
        int BitMask = a | b; 
        return n & BitMask;
    }
    // check if number is 2 the power n or not

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    // count set bit in number 
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
               count++;
            }
            n = n>>1;
        }
        return count;
    }
    // Fast Exponetial
    public static int Fastexpo(int a , int n){
        int ans = 1;
        while(n>0){
         if((n&1) != 0){// check lsb
            ans = ans*a;
         }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    
}
