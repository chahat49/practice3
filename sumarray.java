import java.util.*;
public class MyClass {
   
    public static void main(String args[]) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int arr[]=new int[n];
     //scan an array
      for(int i=0;i<n;i++)
      {
          arr[i]=scan.nextInt();
      }
      //initialise 2 variables
     int max=0;
    int maxf=0;
    for(int i=0;i<n;i++)
    {//store the sum in max;
      max=max+arr[i];
     if(max<0)
        {
          max=0;
        }
        //max after sum greater than maxf then store
 else if(max>maxf)
            maxf=max;

    }//print maximum
    System.out.println(maxf);
     
    }
}