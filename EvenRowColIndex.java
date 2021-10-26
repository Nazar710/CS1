public class EvenRowColIndex {
  public static int evenRowColIndex(int[][] M){
    //we uterate through i row
    int res = -1;
    boolean flag = true;
     //check if row/col[i] has only even numbers(main check)
    for(int i =0;i<M[0].length;i++){
      for(int j=0;j<M.length;j++){
        flag = true;
        if(M[j][i]%2!=0) {
         flag = false;
         break;          
        };
      }
      if (flag&&i<M.length){  
        for(int c=0;c<M[0].length;c++){
          if(M[i][c]%2!=0) {
            flag=false;
            break;
          }
        }
        if(flag)return i;
      }    
    }
    return res;
  }
  public static void main(String[] args){
    int[][] M = new int[][]{
      {1,2,3,4,2},
      {4,2,6,4,6},
      {1,4,3,4,8},
      {1,2,3,4,4},
      {2,2,2,2,2}
    };
    System.out.println(evenRowColIndex(M));
  }
}
