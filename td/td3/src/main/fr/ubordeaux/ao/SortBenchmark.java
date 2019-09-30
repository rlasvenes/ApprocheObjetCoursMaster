package fr.ubordeaux.ao;

import java.util.ArrayList;
import java.util.List;

public class SortBenchmark {
    private List<SortAlgo> algos;

    public SortBenchmark() {
        algos = new ArrayList<SortAlgo>();
    }

    public void addAlgorithm(SortAlgo algo) {
        if (!algos.contains(algo)) {
            algos.add(algo);
        }
    }

    public void bench(String[] unsorted) {
        for (SortAlgo sa : algos) {
            System.out.printf("--> benching sort : " + sa.getClass().getSimpleName());
            long start = System.nanoTime();
            sa.sort(unsorted);
            long end = System.nanoTime() - start;
            System.out.println(" in : " + end + " ns");
        }
    }

}
