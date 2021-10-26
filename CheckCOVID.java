public class CheckCOVID {
    public static boolean checkCOVID (int[][]arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                int sum = 0;

                // Check all arr[i][j] and find which indeces exist
                int startx = Math.max(0, i-1);
                int endx = Math.min(i+1, rows-1);
                int starty = Math.max(0, j-1);
                int endy = Math.min(j+1, cols-1);

                for(int x=startx; x<=endx; x++) {
                    for(int y=starty; y<=endy; y++) {   // Make sure that we do not add the current element
                        if(x!=i || y!=j)
                            sum += arr[x][y];
                    }
                }

                if(sum==arr[i][j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{4,36,8,5},{5,6,7,7},{0,19,1,13}};   // true
        int[][] B = {{1,5},{2,6},{6,7},{4,8}};                      // false

        System.out.println(checkCOVID(A));
        System.out.println(checkCOVID(B));
    }
    
}