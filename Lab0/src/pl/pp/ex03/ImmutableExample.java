package pl.pp.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Example 3: Immutable Data
public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList =
                Collections.unmodifiableList(new ArrayList<>());
        // immutableList.add("Item");
        // This will throw UnsupportedOperationException

        System.out.println("Immutable List: " + immutableList);
    }
}
