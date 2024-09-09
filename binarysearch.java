import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int arr[]=new int[10];
        int b,l=0,r=9,m;
        System.out.println("enter the 10 elements:-");
        for(int i=0;i<10;i++){
            arr[i]=s1.nextInt();
        }
        System.out.println("enter the target you wants:-");
        b=s1.nextInt();
        while (l<=r) {
            m=(l+r)/2;
        if (arr[m]==b) {
            System.out.println("the target is found this position:-"+m);
            break;
      }
        else if(arr[m]>b){
            r=m-1;
        }
        else{
            l=m+1;
        }   
        }
        
    

    
   
    }}
