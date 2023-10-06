public class Main {
    public static void main(String[] args)
    {
        int[] array = {65, -1, 8, 14, 22, -112};
        int index = 0;
        boolean found = false;
        int key = 14; // the number we are checking if it is present in the array

        while (!found && index < array.length) // to give the array boundaries
        {
            if (array [index] == key) // if an array element is equal to key
                found = true;
            index ++; // goes to the next element
        }
        System.out.println(found);
    }
}