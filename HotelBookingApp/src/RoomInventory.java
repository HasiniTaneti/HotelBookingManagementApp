import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * CLASS – RoomInventory
 * ============================================================
 *
 * Description:
 * This class manages room availability using a centralized
 * HashMap data structure.
 *
 * It provides:
 * - Registration of room types
 * - Availability lookup
 * - Controlled inventory updates
 * - Display of current inventory state
 *
 * This ensures a single source of truth for room availability.
 * Manages centralized room availability using HashMap.
 *
 * @author Developer
 * @version 3.0
 * @version 4.0
 */
class RoomInventory {

    private HashMap<String, Integer> inventory;
    private HashMap<String, Integer> availability;

    /**
     * Initializes the room inventory with default room counts.
     */
    public RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
        availability = new HashMap<>();
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);
    }

    /**
     * Returns current availability for a given room type.
     * Returns the full room availability map.
     *
     * @param roomType type of room
     * @return available count
     * @return room availability map
     */
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
        public Map<String, Integer> getRoomAvailability() {
            return availability;
        }

        /**
         * Updates room availability in a controlled way.
         * Returns availability for a room type.
         *
         * @param roomType type of room
         * @param newCount updated count
         * @param roomType room type
         * @return available count
         */
        public void updateAvailability(String roomType, int newCount) {
            inventory.put(roomType, newCount);
            public int getAvailability(String roomType) {
                return availability.getOrDefault(roomType, 0);
            }

            /**
             * Displays the entire inventory state.
             * Updates availability in a controlled way.
             *
             * @param roomType room type
             * @param count new count
             */
            public void displayInventory() {
                System.out.println("Current Room Inventory:");
                for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
                public void updateAvailability(String roomType, int count) {
                    availability.put(roomType, count);
                }
            }