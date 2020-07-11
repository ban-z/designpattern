package structuretype.adapter.storyrealized;

public class OperationAdapter implements ScoreOperation {

    //对象持有形式
    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter(){
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    //调用适配者类QuickSort的排序方法
    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    //调用适配者类BinarySearch的查找方法
    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
