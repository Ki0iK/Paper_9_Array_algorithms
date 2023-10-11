public class Main {
    public static void main(String[] args)
    {
        int[] vals = {-65, -54, -5, 16, 78, 1998};
        int key = 78; // the thing we are trying to find

        int lo = 0, hi = vals.length - 1; // lo - the start / beginning, hi - the end
        boolean found = false;
        while (lo <= hi)
        {
            int mid = (lo + hi) / 2;
            int v = vals [mid]; // to not have to rewrite vals [mid] over and over again
            if (v == key) // checking if the middle is the key we are trying to find
            {
                found = true;
                break;
            }
            else if (v < key) // the next stage, checking the bigger side of the array
                lo = mid + 1;
            else
                hi = mid - 1; // checking the lower side of the array
        }
        System.out.println(found);
    }
}