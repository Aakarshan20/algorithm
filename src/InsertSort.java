

public class InsertSort {
    public static void main(String [] args){
        int[] array = {9,6,1,5,4,3,100,998,50};
        TestInsertSort testInsertSort = new TestInsertSort();
        int[] newArray = testInsertSort.insertSort(array);
        for(int i : newArray){
            System.out.print(i + " ");
        }
    }
}

