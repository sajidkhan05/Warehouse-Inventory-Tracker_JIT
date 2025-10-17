Warehouse Inventory Tracker (Event-Based):

Project Overview:
>The Warehouse Inventory Tracker is a Java-based console application that simulates a real-time
inventory management system for a warehouse.
>It automatically updates stock levels when shipments arrive or customer orders are fulfilled
and triggers low-stock alerts when the quantity falls below a defined threshold.
>The project demonstrates Object-Oriented Programming (OOP) principles and the Observer Design
Pattern to handle event-driven updates efficiently.

Features:
>Add new products dynamically
>Receive shipments to increase stock
>Fulfill customer orders (reduces stock)
>Automatic “Low Stock Alert” when stock < threshold
>In-memory storage using HashMap (no database)
>Graceful handling of invalid product IDs and insufficient stock
>Implements Observer Pattern for real-time alert mechanism

Bonus Features (Implemented):
>Multithreading: Simulates simultaneous stock updates from multiple workers
>File Persistence: Saves and loads inventory data from a text file between runs
>Multiple Warehouses: Manages and tracks multiple warehouse instances

Class Overview:
	Class / Interface	                Responsibility
	Product	            -  	 Represents an item with ID, name, quantity, and reorder threshold
	Warehouse           -	 Manages inventory operations like addProduct, receiveShipment, fulfillOrder
	StockObserver		-	 Interface for alert mechanism
	AlertService			-	 Implements StockObserver, displays alerts when stock is low
	WarehouseManager		-	 Manages multiple warehouses (bonus feature)
	Main 				-	 Entry point to run and simulate the application

Design Pattern Used:

Observer Pattern:
The application uses the Observer Pattern for event-based updates:
>The Warehouse acts as the Subject
>AlertService acts as the Observer
>When a product’s stock falls below the threshold, the observer is notified and an alert is triggered automatically.

Technologies Used:
>Language: Java (JDK 8+)
>Collections: HashMap, List
>OOP Concepts: Encapsulation, Abstraction, Polymorphism
>Design Pattern: Observer Pattern
>Threading: Java Multithreading for concurrent updates
>File I/O: Text file persistence

Example Workflow:
1️. Add a new product: “Laptop” with a reorder threshold of 5
2️. Receive a shipment of 10 units (total = 10)
3️. Fulfill 6 orders (remaining = 4)
4️. System triggers alert → “Low stock for Laptop — only 4 left!”

Future Enhancements:
>GUI or Web Interface using JavaFX or JSP/Servlets
>Integration with Database (MySQL or MongoDB)
>Email/SMS alerts for low stock notifications

Author:
Sajid Khan
B.Tech CSE | Full Stack Developer (in progress)
Jawaharlal Institute of Technology, Borawan, MP.
