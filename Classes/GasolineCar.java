package Classes;

public class GasolineCar extends Car {

    private int engineCC;

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public double calculateTax() {

        double tax;

        if (engineCC <= 600) {
            tax = engineCC * 0.50;
        }
        else if (engineCC <= 1800) {
            tax = (600 * 0.50)
                    + ((engineCC - 600) * 1.50);
        }
        else {
            tax = (600 * 0.50)
                    + (1200 * 1.50)
                    + ((engineCC - 1800) * 4);
        }

        return tax;
    }
}
