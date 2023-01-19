package pattern.creational.prototype;

import pattern.creational.builder.CityBike;

import java.util.StringJoiner;

public class AuchanBike implements Cloneable {

    private final CityBike oemBike;
    private final Long serialNumber;

    public AuchanBike(CityBike oemBike) {
        this.oemBike = oemBike;
        this.serialNumber = 100001L;
    }

    private AuchanBike(AuchanBike auchanBike) {
        this.oemBike = auchanBike.getOemBike();
        this.serialNumber = auchanBike.serialNumber + 1;
    }

    public CityBike getOemBike() {
        return oemBike;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AuchanBike.class.getSimpleName() + "[", "]")
                .add("serialNumber=" + serialNumber)
                .add("oemBike=" + oemBike)
                .toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new AuchanBike(this);
    }

}
