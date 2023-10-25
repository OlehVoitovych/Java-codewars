package ArrayDiff;

import java.util.*;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> res = new ArrayList<>();
        if (a.length != 0 && b.length != 0) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (b[i] != a[j]) {
                        res.add(a[j]);
                    }
                }
            }


            a = new int[res.size()];
            int count = 0;
            for (int i : res) {
                a[count] = i;
                count++;
            }
            return a;
        }
        else {
            return a;
        }
    }

}
