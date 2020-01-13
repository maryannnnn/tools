package GitarsApp;

import java.util.Objects;

public class Guitar {
    private String serialNumber;
    private double price;
    private GutarSpec spec;

    public Guitar(String serialNumber, double price, GutarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }


    public GutarSpec getSpec() {
        return spec;
    }

    public void setSpec(GutarSpec spec) {
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return Double.compare(guitar.price, price) == 0 &&
                Objects.equals(serialNumber, guitar.serialNumber) &&
                Objects.equals(spec, guitar.spec);
    }

    @Override
    public int hashCode() {

        return Objects.hash(serialNumber, price, spec);
    }
}




