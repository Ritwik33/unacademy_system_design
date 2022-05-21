package lld.designPatterns.structuralDesignPattern.adapterDesignPattern;

public class ElectricSocket {

    public Voltage fetchElectricVoltage() {
        return new Voltage(240);
    }

}
