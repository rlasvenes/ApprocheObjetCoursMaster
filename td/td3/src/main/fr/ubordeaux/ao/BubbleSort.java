package fr.ubordeaux.ao;

class BubbleSort implements SortAlgo {
    public String[] sort(String[] unsorted) {
        String[] copy = unsorted.clone();

        for (int i = 0; i < copy.length; i++) {
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[i].compareTo(copy[j]) < 0) {
                    String tmp = copy[j];
                    copy[j] = copy[i];
                    copy[i] = tmp;
                }
            }
        }

        return copy;
    }
}
