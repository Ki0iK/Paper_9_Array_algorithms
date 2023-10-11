public class Main {
    public static void main(String[] args) {
        Reservation[] reservations = new Reservation[3];
        reservations[0] = new Reservation("John", 564);
        reservations[1] = new Reservation("Wendy", 564);
        reservations[2] = new Reservation("Mandy", 176);

        String key = "Wendy";
        for (Reservation r : reservations)
            if (r.name.equals(key)) {
                System.out.println(r.roomNumber);
                break;
            }
    }
}
    class Reservation
    {
        Reservation (String name, int roomNumber)
        {
            this.name = name;
            this.roomNumber = roomNumber;
        }
        String name;
        int roomNumber;
    }