public class prac1 {
    public static void main(String[] args) {
                 int[][] Arr = { {4,7,8},
                         {8,8,7} }; 
                         int key = 7;
                        System.out.println(printDigit(Arr, key));
    }
    public static int printDigit(int Arr[][] , int key){
            int count = 0; 

            for(int i = 0; i<Arr.length; i++){
                for(int j = 0; j<Arr[0].length; j++){
                    if(Arr[i][j] == key){
                        count++;
                    }
                }
            }
            return count;
    }     
}
// | Problem Type   | Approach           |
// | -------------- | ------------------ |
// | Find element   | Staircase search ✅ |
// | Count elements | Full traversal ✅   |

//****dry run code */

// | i | j | value | count |
// | - | - | ----- | ----- |
// | 0 | 0 | 4     | 0     |
// | 0 | 1 | 7     | 1     |
// | 0 | 2 | 8     | 1     |
// | 1 | 0 | 8     | 1     |
// | 1 | 1 | 8     | 1     |
// | 1 | 2 | 7     | 2     |

// 👉 Final Answer = 2;


