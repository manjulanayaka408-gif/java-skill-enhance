import java.util.*;
class LargestNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Ais the largest number");
        }
        else if(b>a && b>c){
            System.out.println("B is the largest number");
        }
        else{
            System.out.println("C is the largest number");
        }
    }
}