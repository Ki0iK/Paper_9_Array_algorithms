public class Main {
    public static void main(String[] args)
    {
        int[] vals = {7, 9, 11, 2};
        boolean  running = true;
        int passes = 0;

        while (running)
        {
            running = false;
            for (int i = 0; i < vals.length - 1 - passes; i ++) // to slide the bubble through the vals
                                                                // - passes so that we don't need to pass
                                                                // the bubble until the end = less work
            {
                if (vals [i] > vals [i + 1]) //if it finds two elements where the 1st one is bigger -> swap
                {
                    swap (vals, i, i + 1); // if it is swapping, running stays true
                    running= true;
                }
            }
            passes ++;
        }
        for (int v : vals)
            System.out.print(v + " ");
    }
    static void swap (int[] array, int ind1, int ind2) // introducing swap so that it can be used in the code
    {
        int tmp = array [ind1];
        array [ind1] = array [ind2];
        array [ind2] = tmp;
    }
}