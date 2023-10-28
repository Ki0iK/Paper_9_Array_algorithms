public class Main {
    public static void main(String[] args)
    {
        String[] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades = {"B", "D", "B", "A"};
        String key = "Ben";

        for (int i = 0; i < students.length; i ++)
        {
            if (students[i] .equals(key)) // if students at position i is equal to the key
            {
                System.out.println("Ben: " + grades[i]); // grades at position i
                break; // break out of the loop
            }
        }
    }
}