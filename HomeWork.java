import java.util.Arrays;


public class HomeWork {
  public static double average(int[] a){
    double avrg = 0.0;
    for (int i =0;i<a.length;i++){
      avrg = avrg + a[i];
    }
    return avrg/a.length-1;
  }

  public static int min(int[] a){
    int min= a[0];
    for(int i =0; i<a.length; i++){
      if(a[i]<min) min = a[i];
    }
    return min;
  }

  public static int closest(int[] a){
    int clst= Math.abs(a[0]);
    for(int i =0; i<a.length;i++){
      if(Math.abs(a[i])<clst){
        clst = a[i];
      }
    }
    return clst;
  }

  public static int positionMax(int[ ] a){
    int pos = 0;
    for(int i =0; i<a.length;i++){
      if(a[i]>pos) {
        pos = i; 
      }
    }
    return pos;
  }

  public static void biggerThenAvrg(int[] a){
    double avg = average(a);
    for(int i =0;i<a.length;i++){
      if(a[i]>avg){
        System.out.print(a[i]+ " ");
      }
    }
    System.out.println("\n");
  }

  public static void asc(int[] a){
    Arrays.sort(a);
    for(int i =0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println("\n");
  }

  public static double percentEven(int[] a){
    double even = 0;
    double percent = 0.0;
    for(int i =0;i<a.length;i++){
      if(a[i]%2==0){even++;}
    }
    percent = even/a.length*100;
    return percent;
  }

  public static boolean checkGrades(double[] a){
    for (int i =0;i<a.length;i++){
      if(a[i]<5.5) return  false;
    }
    return true;
  }

  public static int gap(int[] a){
    int gap=(a[1]-a[0]);
    if(a.length<2) return 0;
    for(int i=1;i<a.length-1;i++){
      if(Math.abs(a[i+1]-a[i])<gap) gap = Math.abs(a[i+1] - a[i]);
    }
    return gap;
  }

  public static boolean equals(int[] a, int[] b){
    if(a.length!=b.length) {return false;}
    for(int i=0;i<a.length;i++){
      if(a[i]!=b[i]) {
        return false;
      }  
    }
    return true;
  }
public static int[] append(int[]a, int[]b){
  //create a new array of length a+b
  int[] bigger = Arrays.copyOf(a,(a.length+b.length));
  //System.out.println();
  //populate new array in a for loop
  for(int i = 0;i<b.length;i++){
    int d = i +a.length;
    bigger[d] = b[i];
  }
  return bigger;
}

public static void copyRange(int[] a,int[] b, int x,int y,int n){
  if(a.length-1<x+n||b.length-1<y+n){
    return ;//System.out.println("The array a or b ae too small to manage this transition! ");
  }
  for(int i = x;i<n+x;i++,y++){
    b[y] = a[i];
  }
}
//method that swaps 2 arrays, array 1 contains elements of array2 and vice versa
public static void swapAll(int[] a, int[] b){
  //prepare helper array for swapping
  int[] helper = a;
  System.out.println(helper.length);
  for(int i = 0;i<a.length;i++){
    //System.out.print(b[i]);
    //System.out.print(a[i]);
    //System.out.print(helper[i]);
    a[i]=b[i];
    b[i]= helper[i]; 
  }
}

// public static int[] longestSortedSequence(int[]a){
// 
// }
//method rhat returns an int[] which contains only positive el as many times , as el is.
public static int[] repeatArray(int[]a){
  //prepare a new array of certain size
  int size = 0;
  for(int i = 0;i<a.length;i++){
    if(a[i]>0){
      size = size + a[i];
    }
  }
  //declare a new array
  int[] nAr = new int[size];
  int counter = 0;
  //iterate through array , if an el is pos - add to new aaray a[i] times
  for(int i = 0;i<a.length;i++){
    if(a[i]>0){
      for(int k=0;k<a[i];k++){
        nAr[counter] = a[i];
      }
      counter = counter + a[i];
    }    
  }
  return nAr;
}


  public static void main(String[] args){
    double[] grail = new double[]{6.0,5.0,7.5,8.0,6.5,5.0,5.5,9.0,5.0};
    int[] a = {-2,2,-3,4,5,1,6,7};
    int[] b = {-2,2,-3,4,1,6,8};
    int[] c = {1,2,3,4,5,6};
    int[] k = {0,9,8,7,6,5};
    
    double res = average(a);
    System.out.println(res);

    System.out.println(min(a));
    System.out.println(positionMax(a));
    System.out.println(closest(a));
    biggerThenAvrg(a);
    asc(a);
    System.out.println(percentEven(a));
    System.out.println(checkGrades(grail));
    System.out.println(equals(c,b));
    System.out.println(gap(b));
    System.out.println(append(a,b).length);
    //copyRange(c,a,5,0,3);
    swapAll(c,k);
    // for(int i = 0;i<c.length;i++){
      // System.out.print(c[i]+" ");
    // }
    // System.out.println("\n");
    // for(int i = 0;i<c.length;i++){
      // System.out.print(k[i]+" ");
    // }
  }
}
