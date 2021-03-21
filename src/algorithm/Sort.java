package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp = 0;

        for(int j=0; j<array.length; j++){
            for(int i=j; i>0; i--){
                if(array[i]<array[i-1]){
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int temp = 0;
        for(int i=0; i<array.length; i++){
            for(int j=1; j<(array.length-1); j++){
                if(array[j-1]> array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public void mergeSort(int [] array){
        int [] list = array;
        //implement here
        if(array.length > 1){
            int[] prev = left(array);
            int[] next = right(array);
            mergeSort(prev);
            mergeSort(next);
        }

        public int [] prev(int [] array){
            int num1 = array.length / 2;
            int[] prev = new int[num1];
            for (int i = 0; i < num1; i++) {
                prev[i] = array[i];
            }
            return prev;
        }

        public static int[] next(int[] array) {
            int num1 = array.length / 2;
            int num2 = array.length - num1;
            int[] next = new int[num2];
            for (int i = 0; i < num2; i++) {
                next[i] = array[i + num1];
            }
            return next;
        }

        public void merge(int[] result, int[] prev, int[] next) {
            int num3 = 0;
            int num4 = 0;

            for (int i = 0; i < result.length; i++) {
                if (num3 >= next.length || (num3 < prev.length && prev[num3] <= next[num4])) {
                    result[i] = prev[num3];
                    num3++;
                } else {
                    result[i] = next[num4];
                    num4++;
                }
            }
        }


    }


    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here

        

        return list;
    }
    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
            buildHeap(array);
            for(int i = array.length-1; i>=1; i--){
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                heapify(array, i, 0);
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }
        public void buildHeap(int[] array){
            for(int i=array.length/2-1; i >= 0; i--){
                heapify(array, array.length, i);
            }
        }
        public void heapify(int[] array, int n, int i){
            int max;
            int child;
            child = 2 * i + 1;
            max = i;
            if(child < n){
                if(array[child] > array[max]){
                    max = child;
                }
                if(child+1 < n){
                    if(array[child + 1] > array[max]){
                        max = child + 1;
                    }
                }
                if(max != i){
                    int temp = array[i];
                    array[i] = array[max];
                    array[max] = temp;
                    heapify(array, n, max);
                }
            }
        }



    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int one = max(array);
        int[] container = new int[one+1];
        for(int i=0; i<container.length; i++){
            container[i] = 0;
        }
        for(int i=0; i<array.length; i++){
            container[array[i]]++;
        }
        int out = 0;
        for(int i=0; i<container.length; i++){
            for(int j=0; j<container[i]; j++){
                array[out++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }


    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        int inside, outside;
        int temp;
        int a = 1;
        while(a <= array.length/3)
            a = a*3 + 1;
        while(a>0)
        {
            for(outside=a; outside<array.length; outside++)
            {
                temp = list[outside];
                inside = outside;
                while(inside > a-1 && list[inside-a] >= temp)
                {
                    list[inside] = list[inside-a];
                    inside -= a;
                }
                list[inside] = temp;
            }
            a = (a-1) / 3;
        }
        return list;
    }


    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
