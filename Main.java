import Classes.*;

public class Main {

    public static void main(String[] args) {

        // Toyota New YARIS Cross
        GasolineCar car1 = new GasolineCar();

        car1.setBrand("TOYOTA");
        car1.setModel("New YARIS Cross");
        car1.setPrice(911000);
        car1.setWeight(1285);
        car1.setEngineCC(1500);


        // BYD Dolphin 490
        ElectricCar car2 = new ElectricCar();

        car2.setBrand("BYD");
        car2.setModel("Dolphin 490");
        car2.setPrice(859999);
        car2.setWeight(1658);


        // Honda CR-V E 2023
        GasolineCar car3 = new GasolineCar();

        car3.setBrand("HONDA");
        car3.setModel("CR-V E 2023");
        car3.setPrice(1419000);
        car3.setWeight(1743);
        car3.setEngineCC(1500);


        // AION ES ev 2023
        ElectricCar car4 = new ElectricCar();

        car4.setBrand("AION");
        car4.setModel("ES ev 2023");
        car4.setPrice(850000);
        car4.setWeight(1290);

        //loan setting
        double downPaymentPercent = 30;
        double interestRate = 1.89;
        int months = 60;

        // Display
        System.out.println("===== CAR 1 =====");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Weight: " + car1.getWeight());
        System.out.println("Weight: " + car1.getWeight());
         double down1 = car1.getPrice() * downPaymentPercent / 100;
        double loan1 = car1.getPrice() - down1;
        double interest1 = loan1 * (interestRate / 100) * months / 12;
        double monthly1 = (loan1 + interest1) / months;

        System.out.println("Down Payment: " + down1);
        System.out.println("Loan Amount: " + loan1);
        System.out.println("Interest: " + interest1);
        System.out.println("Monthly Installment: " + monthly1);
        System.out.println("Tax: " + car1.calculateTax());


        System.out.println("\n===== CAR 2 =====");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Price: " + car2.getPrice());
        System.out.println("Weight: " + car2.getWeight());
        double down2 = car2.getPrice() * downPaymentPercent / 100;
        double loan2 = car2.getPrice() - down2;
        double interest2 = loan2 * (interestRate / 100) * months / 12;
        double monthly2 = (loan2 + interest2) / months;

        System.out.println("Down Payment: " + down2);
        System.out.println("Loan Amount: " + loan2);
        System.out.println("Interest: " + interest2);
        System.out.println("Monthly Installment: " + monthly2);
        System.out.println("Tax: " + car2.calculateTax());


        System.out.println("\n===== CAR 3 =====");
        System.out.println("Brand: " + car3.getBrand());
        System.out.println("Model: " + car3.getModel());
        System.out.println("Price: " + car3.getPrice());
        System.out.println("Weight: " + car3.getWeight());
        System.out.println("Engine CC: " + car3.getEngineCC());
        double down3 = car3.getPrice() * downPaymentPercent / 100;
        double loan3 = car3.getPrice() - down3;
        double interest3 = loan3 * (interestRate / 100) * months / 12;
        double monthly3 = (loan3 + interest3) / months;

        System.out.println("Down Payment: " + down3);
        System.out.println("Loan Amount: " + loan3);
        System.out.println("Interest: " + interest3);
        System.out.println("Monthly Installment: " + monthly3);
        System.out.println("Tax: " + car3.calculateTax());


        System.out.println("\n===== CAR 4 =====");
        System.out.println("Brand: " + car4.getBrand());
        System.out.println("Model: " + car4.getModel());
        System.out.println("Price: " + car4.getPrice());
        System.out.println("Weight: " + car4.getWeight());
          double down4 = car4.getPrice() * downPaymentPercent / 100;
        double loan4 = car4.getPrice() - down4;
        double interest4 = loan4 * (interestRate / 100) * months / 12;
        double monthly4 = (loan4 + interest4) / months;

        System.out.println("Down Payment: " + down4);
        System.out.println("Loan Amount: " + loan4);
        System.out.println("Interest: " + interest4);
        System.out.println("Monthly Installment: " + monthly4);
        System.out.println("Tax: " + car4.calculateTax());
    }
}
