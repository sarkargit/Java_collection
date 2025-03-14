

import java.util.*;

public class ParkingLot {
    private Map<Integer, Vehicle> occupiedSlots = new HashMap<>();
    private Set<String> parkedVehicles = new HashSet<>();
    private PriorityQueue<Integer> vipParkingQueue = new PriorityQueue<>();
    private TreeSet<Integer> availableSlots = new TreeSet<>();

    public ParkingLot(int totalSlots) {
        for (int i = 1; i <= totalSlots; i++) {
            availableSlots.add(i);
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (parkedVehicles.contains(vehicle.getLicensePlate())) {
            System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " is already parked!");
            return false;
        }

        if (availableSlots.isEmpty()) {
            System.out.println("Parking is full!");
            return false;
        }

        int slot = availableSlots.pollFirst(); // Get the first available slot
        occupiedSlots.put(slot, vehicle);
        parkedVehicles.add(vehicle.getLicensePlate());

        if (vehicle.isVip()) {
            vipParkingQueue.add(slot); // VIP vehicles have priority in queue
        }

        System.out.println("Parked " + vehicle + " at slot " + slot);
        return true;
    }

    public boolean removeVehicle(String licensePlate) {
        Integer slotToRemove = null;
        for (Map.Entry<Integer, Vehicle> entry : occupiedSlots.entrySet()) {
            if (entry.getValue().getLicensePlate().equals(licensePlate)) {
                slotToRemove = entry.getKey();
                break;
            }
        }

        if (slotToRemove == null) {
            System.out.println("No vehicle with license plate " + licensePlate + " found!");
            return false;
        }

        occupiedSlots.remove(slotToRemove);
        parkedVehicles.remove(licensePlate);
        availableSlots.add(slotToRemove);

        System.out.println("Removed vehicle with license plate " + licensePlate + " from slot " + slotToRemove);
        return true;
    }

    public void showAvailableSlots() {
        System.out.println("Available Parking Slots: " + availableSlots);
    }

    public void showOccupiedSlots() {
        System.out.println("Occupied Slots: ");
        for (Map.Entry<Integer, Vehicle> entry : occupiedSlots.entrySet()) {
            System.out.println("Slot " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public void processVIPQueue() {
        while (!vipParkingQueue.isEmpty()) {
            int vipSlot = vipParkingQueue.poll();
            System.out.println("VIP Parking Slot Reserved: " + vipSlot);
        }
    }
}
