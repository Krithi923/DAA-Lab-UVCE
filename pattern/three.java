import java.util.*;
public class three{
    public static void printMyName(String name){
    System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String name=scn.next();
        System.out.println("Enter name");
       printMyName(name); 
    }
}