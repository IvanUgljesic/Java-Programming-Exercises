/*Scramblies
Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

Notes:

Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered
Input strings s1 and s2 are null terminated.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False
*/
package javaprogrammingexercises;
public class task1 {
    
    public static boolean scramble(String str1, String str2) {
    char[]letters=str1.toCharArray();
        for (int i = 0; i < str2.length(); i++) {
            int counter=0;
            for (int j = 0; j < letters.length; j++) {
                if(str2.charAt(i)==letters[j]){
                    counter++;letters[j]='?';break;
                }
            }if(counter!=1)return false;
        }
    return true;
    }
}
