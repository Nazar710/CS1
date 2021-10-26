import java.util.ArrayList;
public class AllNumsWithin {
  public static int allNums(int[] a, int k){
    //base case
    if(a.length<=k) return 0;
    int result = 0;
    int counter = 0;//counter to temporary store length of result array

    //prepare array of k numbers
    ArrayList<Integer> arK = new ArrayList<Integer>();
    for(int i=0;i<k;i++){
      arK.add(i,i);
    }

    //main check
    for(int i=0;i<a.length;i++){
      if(arK.contains(a[i])){
        arK.remove((Integer) a[i]);
      }
      if(arK.isEmpty()){
        counter = i+1;
        break;
      }
    }  
      //create new array
    int[] newArray = new int[a.length-1];
    for(int j=1;j<a.length-1;j++){
      newArray[j-1]=a[j];
    }

    counter = allNums(newArray,k);
    if(result>counter&&counter!=0) 
      result = counter;

    
    return result;
  }

  public static void main(String[] args){
    int[] A = new int[]{0,0,2,1,2,1,0,2};
    int k = 3;
    System.out.println(allNums(A,k));
  }
}
