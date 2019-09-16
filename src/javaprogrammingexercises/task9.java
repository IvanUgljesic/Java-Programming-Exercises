/*
 CamelCase Method

Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. All words must have their first letter capitalized without spaces.

For instance:

camelCase("hello case"); // => "HelloCase"
camelCase("camel case word"); // => "CamelCaseWord"
Don't forget to rate this kata! Thanks :)
 */
package javaprogrammingexercises;
public class task9 {
     public static String camelCase(String str) {
        if(str.length()==0 || str==null)return str;
        str=str.trim().replaceAll("  ", " ").replaceAll("  ", " ");
        String solution=(""+str.charAt(0)).toUpperCase();
        for (int i = 1; i < str.length(); i++) {
            if((""+str.charAt(i)).equals(" ")){solution+=(""+str.charAt(i+1)).toUpperCase();i++;continue;}
            solution+=str.charAt(i);
        }
        return solution;
    }
}
