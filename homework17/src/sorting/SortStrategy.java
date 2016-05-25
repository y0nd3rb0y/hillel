package sorting;

public class SortStrategy {
    private Sort sort;

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    SortStrategy(Sort sort){
        this.sort = sort;
    }


    int[] doSort(int[] array){
        return sort.doSort(array);
    }

}
