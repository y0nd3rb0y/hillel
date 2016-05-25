package sorting;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] array = {23, 34, 45,3, 5, 22, 69, 31};
        System.out.println(Arrays.toString(array));
        SortStrategy sortStrategy = new SortStrategy(new BubbleSort());
        System.out.println(Arrays.toString(sortStrategy.doSort(array.clone())));
        sortStrategy.setSort(new QuickSort());
        System.out.println(Arrays.toString(sortStrategy.doSort(array.clone())));
    }

}
