public class DiagonalPrint {
  public static void diagonalPrint(int[][] a){
    //move startPoint along the 1st column
    for(int i =0; i<a.length;i++){
      //print diagonal
      for(int j = 0, k = i;j<a[0].length&&k>=0;j++,k--){
        System.out.print(a[k][j]+" ");
      }
    }
    //move startPoint along last array
    for(int i =1;i<a[0].length;i++){
      //print diagonal
      for(int j = a.length-1, l=i;j>=0&&l<a[0].length;j--,l++){
        System.out.print(a[j][l]+" ");
      }
    }
  }
  public static void main(String[] args){
    int[][] M = {
      {1,2,3,4,5,6,7},
      {5,6,4,5,6,7,9},
      // {0,0},
      // {1,2}  
    };
    diagonalPrint(M);
  }
  
}
