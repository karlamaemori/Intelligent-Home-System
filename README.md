# Simplified Intelligent Home System
The HomeApp needs to manage various home services for an intelligent home system — turning the lights, TV, and air conditioning on and off. Rather than have the client talk to each service directly, HomeApp interacts through a single simplified interface, HomeInterface. HomeInterface delegates requests to the appropriate service classes (Light, TV, AirConditioning) while hiding their internal details, and additionally exposes turnOnAll() and turnOffAll() to control every service at once.

## Class Definitions:
- **HomeService** (Interface): Defines the common interface for all home services.
- **Light**: A service class implementing the HomeService interface, responsible for turning the lights on and off. It includes the turnOn() and turnOff() methods.
- **TV**: A service class implementing the HomeService interface, responsible for turning the TV on and off. It includes the turnOn() and turnOff() methods.
- **AirConditioning**: A service class implementing the HomeService interface, responsible for turning the air conditioning on and off. It includes the turnOn() and turnOff() methods.
- **HomeInterface**: The facade class that coordinates interactions between the client (HomeApp) and the individual home services. It includes the turnOnAll() and turnOffAll() methods to control all services simultaneously.
- **HomeApp**: The client class that uses the HomeInterface to access and utilize home services seamlessly.
