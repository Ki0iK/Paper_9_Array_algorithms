public class Main {
    public static void main(String[] args)
    {
        int[] numb = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 15;
        boolean found = false;

        int lo = 0, hi = numb.length - 1; // very important -1; otherwise wrong
        while (lo <= hi)
        {
            int mid = (lo + hi)/2;
            int n = numb [mid];
            System.out.println(n);
            if (n == key)
            {
                found = true;
                break;
            }
            else if (n < key)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        System.out.print(found);

        System.out.println();


        // Part 2.
        //int[] numb2 = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        //int key2 = 15;


        //int lo2 = 0, hi2 = numb.length - 1;
        //while (lo <= hi)
        //{
          //  int mid2 = (lo2 + hi2)/2;
            //int n2 = numb2 [mid2];
            //if (n2 == key2)
            //{
              //  System.out.println(key2);
                //break;
            //}
           // else if (n2 < key2)
            //{
              //  System.out.println(n2);
                //lo2 = mid2 + 1;
            //}
            //else
            //{
              //  System.out.println(n2);
                //hi2 = mid2 - 1;
            //}
        //}
    }
}