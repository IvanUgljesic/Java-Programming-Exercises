/*
 Multi-tap Keypad Text Entry on an Old Mobile Phone

Prior to having fancy iPhones, teenagers would wear out their thumbs sending SMS messages on candybar-shaped feature phones with 3x4 numeric keypads.

------- ------- -------
|     | | ABC | | DEF |
|  1  | |  2  | |  3  |
------- ------- -------
------- ------- -------
| GHI | | JKL | | MNO |
|  4  | |  5  | |  6  |
------- ------- -------
------- ------- -------
|PQRS | | TUV | | WXYZ|
|  7  | |  8  | |  9  |
------- ------- -------
------- ------- -------
|     | |space| |     |
|  *  | |  0  | |  #  |
------- ------- -------
Prior to the development of T9 (predictive text entry) systems, the method to type words was called "multi-tap" and involved pressing a button repeatedly to cycle through the possible values.

For example, to type a letter "R" you would press the 7 key three times (as the screen display for the current character cycles through P->Q->R->S->7). A character is "locked in" once the user presses a different key or pauses for a short period of time (thus, no extra button presses are required beyond what is needed for each letter individually). The zero key handles spaces, with one press of the key producing a space and two presses producing a zero.

In order to send the message "WHERE DO U WANT 2 MEET L8R" a teen would have to actually do 47 button presses. No wonder they abbreviated.

For this assignment, write a module that can calculate the amount of button presses required for any phrase. Punctuation can be ignored for this exercise. Likewise, you can assume the phone doesn't distinguish between upper/lowercase characters (but you should allow your module to accept input in either for convenience).
 */
package javaprogrammingexercises;

import java.util.ArrayList;

public class task10 {
    public static int presses(String phrase) {
    ArrayList<String>keys=new ArrayList<String>();
        phrase=phrase.toUpperCase();
        keys.add("ABC");keys.add("DEF");keys.add("GHI");keys.add("JKL");keys.add("MNO");keys.add("PQRS");keys.add("TUV");keys.add("WXYZ");
        int pres=phrase.length()-phrase.replaceAll(" ", "").length();
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < keys.size(); j++) {
                if("234568".contains(""+phrase.charAt(i))){pres+=4;break;}
                if("79".contains(""+phrase.charAt(i))){pres+=5;break;}
                if("1*#".contains(""+phrase.charAt(i))){pres+=1;break;}
                if("0".contains(""+phrase.charAt(i))){pres+=2;break;}
                if(keys.get(j).contains(""+phrase.charAt(i))){pres+=keys.get(j).indexOf(""+phrase.charAt(i))+1;break;}
            }
        }
        return pres;
  }
}
