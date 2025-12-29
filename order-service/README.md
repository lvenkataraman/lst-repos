# Order Service

A test Spring Boot application for testing the REST Endpoint Finder.

## Overview

This service manages customer orders with full CRUD operations.

## REST Endpoints

| Method | Endpoint | Mapping | Description |
|--------|----------|---------|-------------|
| GET | `/api/orders/{orderNumber}` | `@GetMapping` | Retrieve an order by order number |
| POST | `/api/orders` | `@PostMapping` | Create a new order |
| DELETE | `/api/orders/{orderNumber}` | `@DeleteMapping` | Delete an order |
| POST | `/api/orders/{orderNumber}` | `@PostMapping` | Modify an existing order |

## Order Model

The Order class contains the following fields:

- `orderNumber` - Unique order identifier
- `orderDate` - Date the order was placed
- `orderItems[]` - Array of item names
- `orderQuantity[]` - Array of quantities for each item
- `customerName` - Customer's name
- `customerAddress1` - Primary address line
- `customerAddress2` - Secondary address line
- `customerAddressCity` - City
- `customerAddressState` - State/Province
- `customerAddressCountry` - Country
- `customerAddressZipCode` - Postal/ZIP code

## Running the Application

```bash
mvn spring-boot:run
```

The application will start on port 8080.

## Example Request

Create an order:
```bash
curl -X POST http://localhost:8080/api/orders \
  -H "Content-Type: application/json" \
  -d '{
    "orderNumber": "ORD-001",
    "orderItems": ["Laptop", "Mouse"],
    "orderQuantity": [1, 2],
    "customerName": "John Doe",
    "customerAddress1": "123 Main St",
    "customerAddressCity": "New York",
    "customerAddressState": "NY",
    "customerAddressCountry": "USA",
    "customerAddressZipCode": "10001"
  }'
```
