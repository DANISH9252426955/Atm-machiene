import java.util.Scanner;

  public class bubblesorting {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n,i,j,temp;
        System.out.println("enter the array size:-");
        n=s1.nextInt();
        int arr[]=new int[n];
        System.out.println("enter value of array:-");
        for(i=0;i<n;i++){
           arr[i]=s1.nextInt();
        }
        for(i=n;i>0;i--){
            for(j=0;j<i-1;j++){
                if ( arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }
            }
        }
        System.out.println("the sorted result is:-");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

    }
    
}
