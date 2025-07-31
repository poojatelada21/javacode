import java.util.Scanner;
public class palindrome{
public static void main(String args[]){
Scanner Sc=new Scanner (System.in);
System.out.println("enter a string:");
String str = Sc.nextLine();
String reverse ="";
for(int i=str.length()-1; i>=0; i--){
reverse=reverse+str.charAt(i);
}
if(str.equalsIgnoreCase(reverse)){
System.out.println(str+"is a palindrome.");
}else{
System.out.println(str+"is not a palindrome.");
}
}
}

