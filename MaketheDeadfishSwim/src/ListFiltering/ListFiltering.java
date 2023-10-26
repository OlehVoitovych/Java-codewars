package ListFiltering;

import java.util.*;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream()
                .filter(e -> e.getClass()
                        .getName()
                        .equals("java.lang.Integer"))
                .toList();
    }
}
