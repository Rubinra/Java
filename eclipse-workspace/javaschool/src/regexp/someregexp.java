package regexp;
import java.util.regex.*;  
class someregexp{  
public static void main(String args[]){  
System.out.println(Pattern.matches("[a-e[A-C]]", "a"));//true (2nd char is s)  
System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
}}  