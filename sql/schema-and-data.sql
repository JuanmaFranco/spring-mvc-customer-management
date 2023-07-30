-- Create schema
CREATE SCHEMA IF NOT EXISTS customer_app;

-- Use the schema
USE customer_app;

-- Create table
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

-- Insert sample data
INSERT INTO customer (first_name, last_name, email) VALUES
('John', 'Doe', 'john.doe@example.com'),
('Jane', 'Smith', 'jane.smith@example.com'),
('Michael', 'Johnson', 'michael.johnson@example.com'),
('Emily', 'Williams', 'emily.williams@example.com'),
('David', 'Brown', 'david.brown@example.com'),
('Sarah', 'Jones', 'sarah.jones@example.com'),
('Christopher', 'Miller', 'christopher.miller@example.com'),
('Laura', 'Davis', 'laura.davis@example.com'),
('Daniel', 'Wilson', 'daniel.wilson@example.com'),
('Megan', 'Anderson', 'megan.anderson@example.com'),
('Matthew', 'Taylor', 'matthew.taylor@example.com'),
('Olivia', 'Lee', 'olivia.lee@example.com'),
('William', 'Martinez', 'william.martinez@example.com'),
('Sophia', 'Garcia', 'sophia.garcia@example.com'),
('James', 'Lopez', 'james.lopez@example.com');
