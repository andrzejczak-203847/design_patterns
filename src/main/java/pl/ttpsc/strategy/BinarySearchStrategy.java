package pl.ttpsc.strategy;

import java.util.Collections;
import java.util.List;

public class BinarySearchStrategy extends SearchStrategy {
    @Override
    public int find(List<Integer> list, Integer element) {
        return Collections.binarySearch(list, element);
    }
}
