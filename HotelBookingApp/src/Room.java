/**
 * Abstract Room class representing common attributes of hotel rooms
 * Abstract Room class representing common attributes of hotel rooms.
 */
abstract class Room {

    private int beds;
    private int size;
    private double price;
    private int available;

    public Room(int beds, int size, double price, int available) {
    public Room(int beds, int size, double price) {
            this.beds = beds;
            this.size = size;
            this.price = price;
            this.available = available;
        }

        public int getBeds() {
            @@ -27,9 +25,5 @@ public double getPrice() {
                return price;
            }

            public int getAvailable() {
                return available;
            }

            public abstract String getRoomType();
        }