import java.util.ArrayList;


public class ArrayAssignment{
  public static int allNumsWithin(int[] A, int K){
  // base case
  if(A.length<=K){
    return 0;
  }  
    int result = 0;
    //initialize counter for the length of the result subarray
    int counter = 0;
    //create ArrayList of all numbers before K
    ArrayList<Integer> arrK = new ArrayList<Integer>();
    for(int i=0;i<K;i++){
      arrK.add(i,i);
    }
    //iteration through array starts
      for(int i=0;i<A.length;i++){
        if(arrK.contains(A[i])){//checks first number in Array 
          arrK.remove((Integer) A[i]);//... cast to object Type and removes it from ArrayList
        }
        if(arrK.isEmpty()){//checks if all numbers from ArrayList are removed
          result = i + 1;//...if yes, the length of result subarray is current Array index + 1
          break;
        }
      }      
      int[] newA = new int[A.length-1];
      for(int tmp=1;tmp<A.length;++tmp)//create a newA for the recursive call
        newA[tmp-1]=A[tmp];
      
      counter = allNumsWithin(newA, K);//recursive call     
      if(result>counter&&counter!=0)
        result = counter;
      
      //return result;          
    return result;
     
  }
  public static void diagonalPrint(int[][] M){
    System.out.print(M[0][0] + " ");
    for(int i=1;i<M.length;i++){
      for(int j=0, k = i;j<Math.min(i+1,M[0].length);j++,k--){
        System.out.print(M[k][j]+" ");
      }
    }  
    for(int b=1;b<M[0].length;b++){
      for(int a=M.length-1,k=b;k<M[0].length;a--,k++){
        //System.out.print("|a= "+ a +"k= "+ k+"/"); 
        if(a>=0)        
          System.out.print(M[a][k]+" ");
        
      }
    }
    System.out.println("\n");
  }

  public static void main(String[] args){
    int[][] M = {
      {1,2,3,4,5},
      {5,6,3,4,5},
    
    
    };
    int[] A = {1, 2, 3, 1, 1, 2, 1, 0, 1, 1, 1, 1, 0, 1, 1, 2, 2, 3, 1};
    int k = 4;
    diagonalPrint(M);
    System.out.println(allNumsWithin(A, k));
  }
}