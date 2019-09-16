/*
Weight for weight

My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.

I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99. Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?

Example:
"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: "100 180 90 56 65 74 68 86 99"

When two numbers have the same "weight", let us class them as if they were strings and not numbers: 100 is before 180 because its "weight" (1) is less than the one of 180 (9) and 180 is before 90 since, having the same "weight" (9), it comes before as a string.

All numbers in the list are positive numbers and the list can be empty.

Notes
it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
Don't modify the input
For C: The result is freed.
 */
package javaprogrammingexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class task4 {
    public static String orderWeight(String strng) {
		if(strng.length()==0 || strng==null)return strng;
	List<Integer>sumOfDigits=new ArrayList<Integer>();
        ArrayList<String>numbers=new ArrayList<String>();
        String[]numbs=strng.split(" ");
        for (int i = 0; i < numbs.length; i++) {
        int sum=0;
            for (int j = 0; j < numbs[i].length(); j++) {
                sum+=Integer.parseInt(numbs[i].charAt(j)+"");
            }
            numbs[i]=sum+" "+numbs[i];
            numbers.add(numbs[i]);
            sumOfDigits.add(sum);
        }
        Collections.sort(numbers);
        Collections.sort(sumOfDigits);
        String solution="";
        for(int i=0;i<sumOfDigits.size();i++){
            for (int j = 0; j < numbers.size(); j++) {
            String[]split=numbers.get(j).split(" ");
            if(sumOfDigits.get(i)==Integer.parseInt(split[0])){
                solution+=split[1]+" ";
                numbers.remove(j);break;
                }
            }
        }
        return solution.trim();
	}
}
