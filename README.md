# hotel-reservation-service :  
 
##  Description : This project is a simple hotel reservation system developed as part of a technical test.
It focuses on core business logic such as room management, user balance validation,
and room booking with date availability checks.

##  Features
- Create and update users with balance
- Create and update hotel rooms
- Book a room with:
  - date validation
  - balance verification
  - availability check (no overlapping bookings)
- Store booking data as an immutable reservation info
- Display all rooms, bookings, and users
  
##  Project Structure
- `entitises`  
  Contains domain classes: `User`, `Room`, `Booking`, `RoomType`
- `services`  
  Contains the `Service` class with all business logic
- `test`  
  Contains a test class that reproduces valid and invalid processe
## Testing
The test class covers:
- Invalid bookings (not enough balance, invalid dates, unavailable rooms)
- Valid bookings
- Room updates without affecting existing bookings

##  Technical Choices
- Java
- ArrayList for in-memory storage (no database)
- Exceptions for business rule validation
- `toString()` overridden for readable console output

