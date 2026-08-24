import java.util.*;
class ArraysSize{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("The elements of an array are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }


    }
}