import java.util.*;
public class prg1{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the 1st number=");
    int a=sc.nextInt();
    System.out.print("enter the second number=");
    int b=sc.nextInt();
    if(a==b){
        System.out.println("equal");
    }else if(a>b){
        System.out.println("a is greater than b");
    }else{
        System.out.println("a is lesser than b");
    }
        

    }
}