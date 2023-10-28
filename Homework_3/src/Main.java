public class Main {
    public static void main(String[] args)
    {
        int[] data = {-4, 11, 7, -12, 6, 1};

        // selection sort
        for (int i = 0; i < data.length; i++)
        {
            int smallestInd = i;
            for (int j = i + 1; j < data.length; j ++)
            {
                // if the value of data at j (second element) is greater than the value of the data
                // at i (first value/ smallest value (smallestInd)) then they need to be swapped
                // and j becomes the smallest value (smallestInd)
                if (data [j] < data [smallestInd])
                    smallestInd = j;
                // now that j is the smallestInd, it needs to be swapped to first position
            }
            if (i != smallestInd)
            {
                int tmp = data [i]; // tmp -> temporary slot in the array to be able to swap
                data [i] = data [smallestInd];
                data [smallestInd] = tmp;
            }
            // inside this loop so that it prints out every step
            // if after the next curvy bracket -> it only prints out the final order
            for (int v : data)
                System.out.print(v + " ");
            System.out.println();
        }
        System.out.println();

        // bubble sort
        int[] data2 = {-4, 11, 7, -12, 6, 1};
        boolean running = true;
        int passes = 0;

        while (running)
        {
            running = false; // why???
            for (int i = 0; i < data2.length - 1 - passes; i ++)
            {
                if (data2 [i] > data2 [i + 1])
                {
                    swap (data2, i, i + 1);
                    running = true;
                }
            }
            passes ++;

            for (int v : data2)
                System.out.print(v + " ");
            System.out.println();
        }
        System.out.println();
    }
    static void swap (int[] array, int ind1, int ind2) // introducing swap
    {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}