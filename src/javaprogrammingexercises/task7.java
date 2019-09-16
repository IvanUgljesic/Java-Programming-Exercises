/*
 Playing with passphrases
Everyone knows passphrases. One can choose passphrases from poems, songs, movies names and so on but frequently they can be guessed due to common cultural references. You can get your passphrases stronger by different means. One is the following:

choose a text in capital letters including or not digits and non alphabetic characters,

shift each letter by a given number but the transformed letter must be a letter (circular shift),
replace each digit by its complement to 9,
keep such as non alphabetic and non digit characters,
downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
reverse the whole result.
#Example:

your text: "BORN IN 2015!", shift 1

1 + 2 + 3 -> "CPSO JO 7984!"

4 "CpSo jO 7984!"

5 "!4897 Oj oSpC"
 */
package javaprogrammingexercises;
public class task7 {
    public static String playPass(String s, int n) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz", numbers="0123456789";
        s=s.toLowerCase();int position=0;String solution="",soluFinal="";
                for (int j = 0; j < s.length(); j++) {
                    if(alphabet.contains(""+s.charAt(j))){
                        position=alphabet.indexOf(""+s.charAt(j))+n;
                        if(position>25)position-=26;
                        if(j%2==0){solution+=(""+alphabet.charAt(position)).toUpperCase();continue;}
                        if(j%2!=0){solution+=(""+alphabet.charAt(position)).toLowerCase();continue;}
                    }
                    if(numbers.contains(""+s.charAt(j))){solution+=(9-(s.charAt(j)-'0'));continue;}
                    solution+=""+s.charAt(j);
                }
                for (int i = solution.length()-1; i >=0; i--) {
                    soluFinal+=solution.charAt(i);
                }
        return soluFinal;
	}
}
