

# 🚗 Parking Lot Management System  
A **Java-based Parking Lot Management System** designed to efficiently handle vehicle parking operations while demonstrating the **Java Collections Framework**. This project focuses on utilizing **HashMap, HashSet, TreeSet, and PriorityQueue** for optimized data management, making it an excellent showcase of **collection-based problem-solving in Java**.

---

## **🎯 Project Objective**  
This project is built to:  
✅ **Showcase Java Collections Framework Skills** by utilizing various collection types efficiently.  
✅ **Implement an optimized parking system** that supports both general and VIP vehicles.  
✅ **Use efficient data structures** for tracking available slots, occupied slots, and priority-based parking.  
✅ **Demonstrate real-world problem-solving** using Java's core data structures and algorithms.  

---

## **📌 Features**  
✔ **Real-time Parking Management** – Vehicles can be parked and removed dynamically.  
✔ **VIP Vehicle Priority System** – VIP vehicles get priority access to slots.  
✔ **Collection-Based Slot Allocation** – Uses **TreeSet** for ordered slot management.  
✔ **Fast Vehicle Lookup** – Uses **HashSet** for quick parked vehicle checks.  
✔ **Efficient Slot Management** – Uses **PriorityQueue** to handle VIP parking queue.  
✔ **Interactive Console Output** – Displays parking status in a user-friendly format.  

---

## **📂 Collections Used & Their Purpose**  

| **Collection Type**         | **Usage in Project** |
|----------------------------|----------------------|
| `HashMap<Integer, Vehicle>` | Stores occupied parking slots (Key: Slot No, Value: Vehicle) |
| `HashSet<String>`           | Keeps track of parked vehicles to prevent duplicates |
| `TreeSet<Integer>`          | Maintains available parking slots in sorted order |
| `PriorityQueue<Integer>`    | Manages VIP parking queue efficiently |

---

## **⚙️ Technologies Used**  
🚀 **Java** – Object-Oriented Programming (OOP) principles.  
📌 **Java Collections Framework** – Efficient storage and retrieval mechanisms.  
🔄 **Multi-Level Data Management** – Simulating a real-world parking system.  
💡 **Console-Based Application** – Interactive user experience with dynamic parking updates.  

---

## **📜 How to Run the Project**  

### **1️⃣ Clone the Repository**  
```bash
git clone https://github.com/your-username/parking-lot-system.git
cd parking-lot-system
```

### **2️⃣ Compile the Java Files**  
```bash
javac Main.java ParkingLot.java Vehicle.java
```

### **3️⃣ Run the Application**  
```bash
java Main
```

---

## **📸 Sample Console Output**  
```
Parked Vehicle{License='WB01AB1234', Owner='Alice', VIP=false} at slot 1
Parked Vehicle{License='WB02XY5678', Owner='Bob', VIP=true} at slot 2
Parked Vehicle{License='WB03LM9012', Owner='Charlie', VIP=false} at slot 3
Parked Vehicle{License='WB04QR3456', Owner='David', VIP=true} at slot 4
Parked Vehicle{License='WB05ST7890', Owner='Eve', VIP=false} at slot 5
Parking lot full. Vehicle{License='WB06UV1234', Owner='Frank', VIP=true} couldn't be parked.
 
Removing vehicle WB01AB1234...
Removed vehicle with license plate WB01AB1234 from slot 1

Available Parking Slots: [1]
Processing VIP Queue...
VIP Parking Slot Reserved: 1
```

---

## **📂 Project Structure**  
```
/parking-lot-system
│── Main.java         # Entry point - Runs the Parking Lot system
│── ParkingLot.java   # Manages parking slots, vehicle allocation, VIP queue
│── Vehicle.java      # Stores vehicle details (License, Owner, VIP status)
│── README.md         # Project documentation
```

---

## **🚀 Future Enhancements**  
🔹 **Graphical User Interface (GUI)** – Improve the user experience with a UI-based system.  
🔹 **Database Integration** – Store parking history and vehicle details persistently.  
🔹 **Automated Ticketing System** – Generate receipts for parked vehicles.  
🔹 **Dynamic Pricing Mechanism** – Charge based on parking duration and vehicle type.  

---

## **👨‍💻 Author**  
- **Ayan Sarkar**  

---

