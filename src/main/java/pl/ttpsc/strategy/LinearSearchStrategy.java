package pl.ttpsc.strategy;

import java.util.List;

public class LinearSearchStrategy extends SearchStrategy {
    @Override
    public int find(List<Integer> list, Integer element) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
