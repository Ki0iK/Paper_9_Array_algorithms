public class Main {
    public static void main(String[] args)
    {
        String[] keys = {"John", "Diana", "Michael"};
        int[] values = {431, 341, 654};
        String key = "Diana";   // looking for information about Diana

        for (int i = 0; i < keys.length; i ++)
        {
            if (keys [i].equals (key)) // if key at the position index is equal to the key we are searching
            {
                System.out.println(values[i]);
                break; // = stop, when it finds it. if not found, it doesn't print anything
            }
        }
    }
}