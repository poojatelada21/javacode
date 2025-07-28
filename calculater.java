import java.io.*;
import java.util.*;
public class calculater{
public static void main(String args[]){
Scanner Sc=new Scanner (System.in);
int choice;
do{
System.out.println("menu");
System.out.println("1.addition");
System.out.println("2.substraction");
System.out.println("3.multiplication");
System.out.println("4.division");
System.out.println("5.exit");
System.out.println("enter your choice");
choice=Sc.nextInt();
switch(choice){

case 1:
System.out.println("enter first number");
double num1=Sc.nextDouble();
System.out.println("enter second number");
double num2=Sc.nextDouble();
System.out.println("Result:"+(num1+num2));
break;

case 2:
System.out.println("enter first number");
num1=Sc.nextDouble();
System.out.println("enter second number");
num2=Sc.nextDouble();
System.out.println("Result:"+(num1+num2));
break;

case 3:
System.out.println("enter first number");
num1=Sc.nextDouble();
System.out.println("enter second number");
num2=Sc.nextDouble();
System.out.println("Result:"+(num1+num2));
break;

case 4:
System.out.println("enter first number");
num1=Sc.nextDouble();
System.out.println("enter second number");
num2=Sc.nextDouble();
if(num2!=0){
System.out.println("Result:"+(num1+num2));
}
else{
System.out.println("error we cannot by zero");
}
break;

case 5:
System.out.println("please! enter a valid choice");
break;
default:
System.out.println("enter your valid choice");
break;
}
}
while(choice!=5);
}
}