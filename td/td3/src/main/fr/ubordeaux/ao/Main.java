package fr.ubordeaux.ao;

class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 1);
        ColoredPoint2Dherit p2 = new ColoredPoint2Dherit(1, 1, 45, 145, 255);

        // La relation entre o1.equals(o2) doit être réfléxive
        // et transitive
        System.out.println("p1 = p2 ? " + p1.equals(p2));
        System.out.println("p2 = p1 ? " + p2.equals(p1));

        String[] unsorted = Utility.generateRandomArray(7, 10000);

        SortBenchmark benchmark = new SortBenchmark();
        benchmark.addAlgorithm(new InsertionSort());
        benchmark.addAlgorithm(new BubbleSort());
        benchmark.bench(unsorted);
    }
}
