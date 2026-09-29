package Classes;

public abstract class Car {

    private String brand;
    private String model;
    private double price;
    private double weight;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double calculateTax();

    //calculateloan
    public double calculateLoan(double downPercent) {
    return getPrice() - (getPrice() * downPercent / 100);
}

//calculate interest
    public double calculateInterest(double downPercent,
                               double interestRate,
                               int months) {

    double loan = calculateLoan(downPercent);

    return loan * (interestRate / 100) * (months / 12.0);
}

// calculateinstallment
public double calculateInstallment(double downPercent,
                                  double interestRate,
                                  int months) {

    double loan = calculateLoan(downPercent);
    double interest = calculateInterest(downPercent, interestRate, months);

    return (loan + interest) / months;
}
public double calculateDownPayment(double downPaymentPercent) {
    return price * downPaymentPercent / 100;
}
}