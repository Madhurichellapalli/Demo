import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        int n=231, temp, rev=0, rem;
        temp=n;
        while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        }
        if(rev==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}