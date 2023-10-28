public class Main {
    public static void main(String[] args)
    {
        int[] a = {7, 9, 2, 11}; // as in the paper example

        for (int i = 0; i < a.length; i ++)
        {
            int smallestInd = i; // starting with the first element and comparing it to the next ones
            for (int j = i + 1; j < a.length; j ++) // want to begin at the next value
            {
                if (a [j] < a [smallestInd]) // a at j is smaller than a at the smallest index
                    smallestInd = j; // smallest index get updated
                    // know that the smallest int is at index 2
            }
            // now that we know -> swap,
            // (but not always need to swap, if smallest element is in correct position)
            if (i != smallestInd)
            {
                // swap a[i] and a[smallestInd]
                int tmp = a [i];
                a [i] = a [smallestInd];
                a [smallestInd] = tmp;
            }
        }
        for (int v : a) //
            System.out.print(v + " ");
        System.out.println();
    }
}