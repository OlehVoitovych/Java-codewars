/*Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.

*/

import DeadFish.DeadFish;
import DescendingOrder.DescendingOrder;

public class Main {
    public static void main(String[] args) {

        DeadFish df = new DeadFish("iiisdoso");
        System.out.println(df);
        DescendingOrder Do = new DescendingOrder(10244356);
        System.out.println(Do);
        int i = DescendingOrder.sortDesc(10244356);
        System.out.println(i);

    }
}