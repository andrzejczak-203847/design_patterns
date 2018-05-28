package pl.ttpsc.strategy;

import java.util.List;

public abstract class SearchStrategy {
    public abstract int find(List<Integer> list, Integer element);
}
