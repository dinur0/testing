

import static org.junit.jupiter.api.Assertions.*;

import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


class VehicleTesting {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Lada","Priora",2015);
        motorcycle = new Motorcycle("Kawasaki","Shadow",2019);
    }

    //проверка того, что экземпляры Car и Motorcycle являются экземпляром Vehicle
    @Test
    @DisplayName("Car и Motorcycle являются транспортными средствами")
    public void IsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
        assertTrue(motorcycle instanceof Vehicle);
    }


    @Test
    @DisplayName("Проверка наличия у Car 4-х колес")
    void CarTestAssertEquals() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("Проверка наличия у Motorcycle 2-х колес")
    void MotorcycleTestAssertEquals() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    @DisplayName("Проверка макс. скорости Car - 60")
    void CarTopSpeed() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    @DisplayName("Проверка макс. скорости Motorcycle - 75")
    void MotorcycleTopSpeed() {
        motorcycle.testDrive();
        assertEquals(75, car.getSpeed());
    }

    @Test
    @DisplayName("Проверка того, что Car - останавливается")
    void stopCar(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    @DisplayName("Проверка того, что Motorcycle - останавливается")
    void stopMotorcycle(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}