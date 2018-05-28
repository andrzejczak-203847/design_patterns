package pl.ttpsc.strategy;

import java.util.List;

public class ElementFinder {
    private final SearchStrategy strategy;

    public ElementFinder(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public int find(List<Integer> list, Integer element) {
        return strategy.find(list, element);
    }
}
