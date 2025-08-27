# JAVA PROJECT

# DRONE DELIVERY MANAGEMENT SYSTEM
  The Drone Delivery Management System is a Java-based application integrated with a MySQL database to simplify and automate delivery operations using drones. It manages customers, drones, orders, and delivery         tracking to ensure timely, safe, and efficient deliveries.

# PROBLEM STATEMENT
  Many delivery companies face challenges in managing bulk orders, tracking real-time deliveries, and allocating resources efficiently. Manual tracking often leads to delays, mismanagement, and reduced customer         satisfaction.
  
# SOLUTION 
  This system provides a centralized software platform to manage customer orders, drone assignments, delivery scheduling, and tracking seamlessly. It ensures efficient resource allocation, timely deliveries, and       improved transparency.

# TARGET USERS
 -->Administrators: Manage drones, delivery schedules, and generate reports.  
 
 -->Customers: Place orders, track delivery status, and view order history.  
 
 -->Drone Operators: Monitor drone assignments and update delivery statuses.  
 
 -->Delivery Managers: Oversee operations and ensure timely deliveries.

# FEATURES
 -->Customer registration and order placement  
 
 -->Drone registration and availability tracking  
 
 -->Order scheduling and drone assignment  
 
 -->Real-time delivery status updates

# OOP CONCEPT
 •Main Classes  
 
    •User (Base Class)  
    
      Attributes: userId, name, email, phone  
      
      Methods: login(), logout()  
      
  •Customer (extends User)  
   
  Attributes: address, orderHistory  
  Methods: placeOrder(), trackOrder()  
      
    •Drone  
    
      Attributes: droneId, status, currentLocation  
      
      Methods: assignOrder(), updateStatus()  
      
    •Order  
    
      Attributes: orderId, customerId, deliveryAddress, orderStatus, orderDate  
      
      Methods: createOrder(), updateOrderStatus(), generateReceipt()  
      
    •Delivery  
    
      Attributes: deliveryId, orderId, assignedDroneId, estimatedTime  
      
      Methods: scheduleDelivery(), trackDelivery()  
      
    •Admin (extends User)  
    
      Methods: registerDrone(), manageOrders(), generateReports()  
      
  
  
   -> Inheritance:Customers and Admins inherit common user features (like login, logout, and contact details) from the base User class.  
   
   -> Polymorphism:Different user roles (Customer, Admin, Drone Operator) can perform the same method (e.g., generateReports() or updateStatus()) in their own way depending on their role.  
   
   -> Association:Orders are associated with both Customers (who place them) and Drones (which fulfill them). Deliveries link Orders and Drones together for execution.  
   
   -> Encapsulation:Data like orderId, paymentDetails, and droneStatus are declared as private.  
   
 
 #UML DIAGRAM
