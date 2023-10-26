/*Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.

*/

import ArrayDiff.ArrayDiff;
import DeadFish.DeadFish;
import DescendingOrder.DescendingOrder;
import ListFiltering.ListFiltering;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DeadFish df = new DeadFish("iiisdoso");
        System.out.println(df);
        DescendingOrder Do = new DescendingOrder(10244356);
        System.out.println(Do);
        int i = DescendingOrder.sortDesc(10244356);
        System.out.println(i);
        int[] arrdif = ArrayDiff.arrayDiff(new int[] {1,1,17,1,12,13,144,2,3,4},new int[] {1,2,3});
        ListFiltering.filterList(List.of(1, 2, "a", "b"));
    }
}