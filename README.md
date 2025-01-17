# FlipCart Order Management System

## Project Overview
The **FlipCart Order Management System** is a Java-based project designed to simulate the management of e-commerce orders. This project uses Java Collections Framework and demonstrates key functionalities like adding, updating, deleting, and viewing orders in a structured manner.

---
## Main Class

You can view the main class source code by clicking the link below:
[View Main Class Source Code](https://github.com/Ananthadatta02/FlipCart-Order-Management-System/blob/master/FlipCart_MainClass.java)

---

## Features
1. **Add New Orders**  
   Allows users to add new orders with details such as order ID, product name, customer name, quantity, and price.

2. **Update Existing Orders**  
   Provides functionality to update details of an existing order using the order ID.

3. **Delete Orders**  
   Enables users to remove an order from the system by specifying the order ID.

4. **View All Orders**  
   Displays the list of all orders in a tabular format for easy viewing.

5. **Search Orders**  
   Allows searching for specific orders by order ID or product name.

6. **Data Persistence**  
   Utilizes Java Collections (`ArrayList`, `HashMap`, etc.) for temporary storage of data during runtime.

---

## Technologies Used
- **Programming Language:** Java
- **IDE:** Eclipse
- **Framework:** Java Collections Framework (JCF)
- **Tools:** Git for version control

---

## Code Structure
### Main Classes
1. **`OrderManagementSystem`**
   - Acts as the entry point for the application.
   - Contains the main method and menu-driven interface for user interactions.

2. **`Order`**
   - Represents the structure of an order.
   - Fields: `orderId`, `productName`, `customerName`, `quantity`, `price`.
   - Methods: 
     - `toString()` for order details.
     - Getters and setters for encapsulation.

3. **`OrderService`**
   - Handles the core logic for managing orders.
   - Implements methods to:
     - Add, update, delete, view, and search orders.

4. **`OrderUtils`**
   - Contains helper methods for input validation and other utility tasks.

---
