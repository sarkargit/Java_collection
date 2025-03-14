public class Main {
    public static void main(String[] args) {
      
        ParkingLot lot = new ParkingLot(5);
        Vehicle car1 = new Vehicle("WB01AB1234", "Alice", false);
        Vehicle car2 = new Vehicle("WB02XY5678", "Bob", true);
        Vehicle car3 = new Vehicle("WB03LM9012", "Charlie", false);
        Vehicle car4 = new Vehicle("WB04QR3456", "David", true);
        Vehicle car5 = new Vehicle("WB05ST7890", "Eve", false);
        Vehicle car6 = new Vehicle("WB06UV1234", "Frank", true);

        // Parking vehicles
        lot.parkVehicle(car1);
        lot.parkVehicle(car2);
        lot.parkVehicle(car3);
        lot.parkVehicle(car4);
        lot.parkVehicle(car5);
        lot.parkVehicle(car6);

         // Showing slots
         lot.showOccupiedSlots();
         lot.showAvailableSlots();

           // Removing a vehicle
        lot.removeVehicle("WB01AB1234");
        lot.showAvailableSlots();

         // Processing VIP Queue
         lot.processVIPQueue();


    }
    
}
