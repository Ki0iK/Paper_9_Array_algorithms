public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");int[] array = {65, -1, 8, 14, 22, -112};
        boolean found = false;
        int key = 14; // the number we are checking if it is present in the array

        for (int index = 0; index < array.length; index ++) // to give the array boundaries
            if (array [index] == key) // if an array element is equal to key
            {
                found = true;
                break;
            }
        System.out.println(found);
    }
}