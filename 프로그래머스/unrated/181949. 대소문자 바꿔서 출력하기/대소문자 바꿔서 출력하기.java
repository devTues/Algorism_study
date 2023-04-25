import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ch = "";
        
        for(int i = 0; i<a.length(); i++) {
            char st = a.charAt(i);
            if(Character.isUpperCase(st)) {
                ch += Character.toLowerCase(st);
            }
            if(Character.isLowerCase(st)) {
                ch += Character.toUpperCase(st);
            }
            
        }
        System.out.print(ch);
    }
}