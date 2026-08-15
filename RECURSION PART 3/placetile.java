public class placetile {

    public static int placetile(int n,int m){
        if(n==m){
            return 2;
    }

    if(n<m){
        return 1;

    }
    // vertical placement
    int verticalPlacement = placetile(n-1, m);
    // horizontal placement
    int horizontalPlacement = placetile(n-m, m);
    return verticalPlacement + horizontalPlacement;

}
public static void main(String[] args) {
    int n = 3;
    int m = 3;

    System.out.println(placetile(n, m));

}
}