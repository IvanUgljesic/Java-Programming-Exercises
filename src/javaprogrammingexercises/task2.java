/*Next bigger number with the same digits

You have to create a function that takes a positive integer number and returns the next bigger number formed by the same digits:

12 ==> 21
513 ==> 531
2017 ==> 2071
If no bigger number can be composed using those digits, return -1:

9 ==> -1
111 ==> -1
531 ==> -1
 */
package javaprogrammingexercises;

import java.util.ArrayList;
import java.util.Collections;
public class task2 {
     public static long nextBiggerNumber(long n){  
        
        if(n<10)return -1;
        int idx=0, temp=0,temp1=0;
        ArrayList<Integer>endDigits=new ArrayList<Integer>();
        String digits[]=(n+"").split("");
        String solution="";
        for (int i = digits.length-1; i >0; i--) {
            if(Integer.parseInt(digits[i])<=Integer.parseInt(digits[i-1])){
                endDigits.add(Integer.parseInt(digits[i]));
            }
            else {
            endDigits.add(Integer.parseInt(digits[i]));
            temp=Integer.parseInt(digits[i-1]);
            idx=i-1;
            break;}
        }
        for (int i = 0; i < endDigits.size(); i++) {
            if(endDigits.get(i)>temp){
                temp1=endDigits.get(i);
                endDigits.set(i,temp);
                temp=temp1;
                break;
            }
        }
        Collections.sort(endDigits);
        solution=(""+n).substring(0,idx)+temp;
        for (int i = 0; i < endDigits.size(); i++) {
            solution+=endDigits.get(i);
        }
        if(Long.parseLong(solution)<n)return -1;
      return Long.parseLong(solution);
    }
}
