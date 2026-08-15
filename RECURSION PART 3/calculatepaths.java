public class calculatepaths {

    public static int countPath(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i>=n || j>=m){
            return 0;
    }
     // downpath
        int downPath = countPath(i+1, j, n, m);

        // rightpath
        int rightPath = countPath(i, j+1, n, m);


        return downPath + rightPath;


}
public static void main(String[] args) {
    int n = 3;
    int m = 3;

    System.out.println(countPath(0,0,n,m));
    
}

}