// A recursive Java program to  
// check whether a given number  
// is palindrome or not 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
      
// A function that reurns true  
// only if num contains one digit 
public static int oneDigit(int num) 
{ 
    // comparison operation is  
    // faster than division  
    // operation. So using  
    // following instead of  
    // "return num / 10 == 0;" 
    if((num >= 0) &&(num < 10)) 
    return 1; 
    else
    return 0; 
} 
  
// A recursive function to  
// find out whether num is  
// palindrome or not.  
// Initially, dupNum contains 
// address of a copy of num. 
public static int isPalUtil(int num,  
                            int dupNum) 
{ 
    // Base case (needed for recursion 
    // termination): This statement 
    // mainly compares the first digit 
    // with the last digit 
    if (oneDigit(num) == 1) 
        if(num == (dupNum) % 10) 
        return 1; 
        else
        return 0; 
  
    // This is the key line in  
    // this method. Note that  
    // all recursive calls have  
    // a separate copy of num, 
    // but they all share same 
    // copy of *dupNum. We divide  
    // num while moving up the  
    // recursion tree 
    if (isPalUtil((int)(num / 10), dupNum) == 0) 
        return -1; 
  
    // The following statements  
    // are executed when we move 
    // up the recursion call tree 
    dupNum = (int)(dupNum / 10); 
  
    // At this point, if num%10  
    // contains i'th digit from  
    // beiginning, then (*dupNum)%10  
    // contains i'th digit from end 
    if(num % 10 == (dupNum) % 10)  
        return 1;  
    else
        return 0; 
} 
  
// The main function that uses  
// recursive function isPalUtil() 
// to find out whether num is  
// palindrome or not 
public static int isPal(int num) 
{ 
    // If num is negative,  
    // make it positive 
    if (num < 0) 
    num = (-num); 
  
    // Create a separate copy  
    // of num, so that modifications  
    // made to address dupNum  
    // don't change the input number. 
    int dupNum = (num); // *dupNum = num 
  
    return isPalUtil(num, dupNum); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
int n = 12321; 
if(isPal(n) == 0) 
    System.out.println("Yes"); 
else
    System.out.println("No"); 
  
n = 12; 
if(isPal(n) == 0) 
    System.out.println("Yes"); 
else
    System.out.println( "No"); 
  
n = 88; 
if(isPal(n) == 1) 
    System.out.println("Yes"); 
else
    System.out.println( "No"); 
  
n = 8999; 
if(isPal(n) == 0) 
    System.out.println("Yes"); 
else
    System.out.println( "No"); 
} 
} 