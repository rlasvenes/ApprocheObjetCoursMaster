package fr.ubordeaux.ao;

/**
 * InsertionSort
 */
public class InsertionSort implements SortAlgo {

    public InsertionSort() {

    }

    public String[] sort(String[] unsorted) {
        String[] copy = unsorted.clone();
        String current;

        for (int i = 1; i < copy.length; i++) {
            current = copy[i];
            int j = i - 1;

            while (j >= 0) {
                if (current.compareTo(copy[j]) > 0) {
                    break;
                }

                copy[j + 1] = copy[j];
                j--;
            }
            copy[j + 1] = current;
        }
        return copy;
    }
}
