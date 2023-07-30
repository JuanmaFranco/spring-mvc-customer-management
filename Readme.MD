# Customer Management CRUD Application 

![Logo](/images/logo.png)

Customer Management CRUD Application is a comprehensive web application designed to facilitate the management of customer information. It is built using a stack of cutting-edge technologies, including Java, Spring Boot, Thymeleaf, MySQL, and Bootstrap.

## Overview

This application provides a user-friendly interface to perform essential CRUD (Create, Read, Update, Delete) operations on customer data. It enables businesses to efficiently organize, store, and manipulate customer information, enhancing their customer relationship management processes.

## Features

- View a list of customers.
- Add new customers to the database.
- Update existing customer information.
- Delete customers from the database.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- MySQL
- HTML
- Bootstrap


## Requirements

- Java Development Kit (JDK) 8 or higher.
- MySQL database server.
- Maven build tool.

## Getting Started

1. Clone the repository to your local machine:

```bash
git clone https://github.com/JuanmaFranco/spring-mvc-customer-management.git
```

2. Navigate to the project directory:
   
```bash
cd spring-mvc-thymeleaf-customer/
```

3. Configure the Database:

    - Before running the application, make sure to set up the MySQL database with the required schema and data.
  
    - In the project's root directory, you will find the `schema-and-data.sql` file under the `sql` folder. This SQL script contains the necessary commands to create the schema and insert sample data for the application to work correctly.
  
        ![Script Example](/images/script1.PNG)
        
        ![Script Example](/images/script2.PNG)
  
    - Execute the `schema-and-data.sql` script in your MySQL database to create the `customer_app` schema and populate it with initial data. You can use tools like MySQL Workbench or the MySQL command-line client to execute the script.
  
    - Update the database connection details in the `application.properties` file located in the `src/main/resources` directory to match your MySQL database configuration. 

4. Run the application using Maven:

```bash
mvn spring-boot:run
```

5. Open your web browser and go to the following link to access the application:

```bash
http://localhost:8080/customers/list
```


## Using the Application

Now that you have successfully set up the Customer Management CRUD Application, you can start using its features to manage customer information. Here's what you can do:

1. **View Customers**: Access the link provided above (`http://localhost:8080/customers/list`) to see a list of existing customers.
   
2. **Add New Customers:** Click on the "Add Customer" button to navigate to the customer creation form. Fill in the required details and click "Save" to add a new customer to the database.
   
3. **Update Customer Information:** On the list of customers, you can click the "Update" button next to any customer's entry to open the customer update form. Modify the information as needed and click "Save" to update the customer's details.
   
4. **Delete Customers:** In the customer list, each entry is accompanied by a "Delete" button. Click this button to remove a customer from the database. 

Please feel free to explore the application and its various features. If you encounter any issues or have any feedback, don't hesitate to report them to us.

## Contributing

Contributions are welcome! If you find any issues or would like to add new features, please open an issue or submit a pull request.

