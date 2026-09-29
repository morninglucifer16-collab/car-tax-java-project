import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Classes.GasolineCar;
import Classes.ElectricCar;

public class CarTest {

    // =========================================
    // CAR 1 - TOYOTA YARIS CROSS
    // =========================================
    @Test
    public void testCar1() {

        GasolineCar car1 = new GasolineCar();

        car1.setBrand("TOYOTA");
        car1.setModel("New YARIS Cross");
        car1.setPrice(911000);
        car1.setWeight(1285);
        car1.setEngineCC(1500);

        // Tax
        assertEquals(1650.0, car1.calculateTax(), 0.01);

        // Down Payment
        assertEquals(273300.0,
                car1.calculateDownPayment(30), 0.01);

        // Loan
        assertEquals(637700.0,
                car1.calculateLoan(30), 0.01);

        // Interest
        assertEquals(60262.65,
                car1.calculateInterest(30, 1.89, 60), 0.01);

        // Monthly installment
        assertEquals(11632.71,
                car1.calculateInstallment(30, 1.89, 60), 0.01);
    }


    // =========================================
    // CAR 2 - BYD DOLPHIN
    // =========================================
    @Test
    public void testCar2() {

        ElectricCar car2 = new ElectricCar();

        car2.setBrand("BYD");
        car2.setModel("Dolphin 490");
        car2.setPrice(859999);
        car2.setWeight(1658);

        // Tax
        assertEquals(130.0,
                car2.calculateTax(), 0.01);

        // Down Payment
        assertEquals(257999.70,
                car2.calculateDownPayment(30), 0.01);

        // Loan
        assertEquals(601999.30,
                car2.calculateLoan(30), 0.01);

        // Interest
        assertEquals(56888.93,
                car2.calculateInterest(30, 1.89, 60), 0.01);

        // Monthly installment
        assertEquals(10981.47,
                car2.calculateInstallment(30, 1.89, 60), 0.01);
    }


    // =========================================
    // CAR 3 - HONDA CR-V
    // =========================================
    @Test
    public void testCar3() {

        GasolineCar car3 = new GasolineCar();

        car3.setBrand("HONDA");
        car3.setModel("CR-V E 2023");
        car3.setPrice(1419000);
        car3.setWeight(1743);
        car3.setEngineCC(1500);

        // Tax
        assertEquals(1650.0,
                car3.calculateTax(), 0.01);

        // Down Payment
        assertEquals(425700.0,
                car3.calculateDownPayment(30), 0.01);

        // Loan
        assertEquals(993300.0,
                car3.calculateLoan(30), 0.01);

        // Interest
        assertEquals(93866.84,
                car3.calculateInterest(30, 1.89, 60), 0.01);

        // Monthly installment
        assertEquals(18119.44,
                car3.calculateInstallment(30, 1.89, 60), 0.01);
    }


    // =========================================
    // CAR 4 - AION ES
    // =========================================
    @Test
    public void testCar4() {

        ElectricCar car4 = new ElectricCar();

        car4.setBrand("AION");
        car4.setModel("ES ev 2023");
        car4.setPrice(850000);
        car4.setWeight(1290);

        // Tax
        assertEquals(100.0,
                car4.calculateTax(), 0.01);

        // Down Payment
        assertEquals(255000.0,
                car4.calculateDownPayment(30), 0.01);

        // Loan
        assertEquals(595000.0,
                car4.calculateLoan(30), 0.01);

        // Interest
        assertEquals(56227.50,
                car4.calculateInterest(30, 1.89, 60), 0.01);

        // Monthly installment
        assertEquals(10853.79,
                car4.calculateInstallment(30, 1.89, 60), 0.01);
    }
}