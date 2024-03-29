/*
 Directions Reduction

Once upon a time, on a way through the old wild west,…
… a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going to one direction and coming back the opposite direction is a needless effort. Since this is the wild west, with dreadfull weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!

How I crossed the desert the smart way.
The directions given to the man are, for example, the following (depending on the language):

["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
or

{ "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
or

[North, South, South, East, West, North, West]
You can immediatly see that going "NORTH" and then "SOUTH" is not reasonable, better stay to the same place! So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:

["WEST"]
or

{ "WEST" }
or

[West]
Other examples:
In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away. What a waste of time! Better to do nothing.

The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] (nil in Clojure).

In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].

Task
Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).

The Haskell version takes a list of directions with data Direction = North | East | West | South.
The Clojure version returns nil when the path is reduced to nothing.
The Rust version takes a slice of enum Direction {NORTH, SOUTH, EAST, WEST}.
 */
package javaprogrammingexercises;

import java.util.ArrayList;

public class task6 {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String>list=new ArrayList<String>();
        for (String string : arr) {
            list.add(string);
        }
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i-1)=="WEST" && list.get(i)!="EAST")continue;
            else if(list.get(i-1)=="EAST" && list.get(i)!="WEST")continue;
            else if(list.get(i-1)=="SOUTH" && list.get(i)!="NORTH")continue;
            else if(list.get(i-1)=="NORTH" && list.get(i)!="SOUTH")continue;
            else {list.remove(i);list.remove(i-1);i=0;continue;}
        }
        String[]solution=new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            solution[i]=list.get(i);
        }
        return solution;
    }
}
