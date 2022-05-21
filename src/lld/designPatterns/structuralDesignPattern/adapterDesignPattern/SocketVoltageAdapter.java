package lld.designPatterns.structuralDesignPattern.adapterDesignPattern;

public interface SocketVoltageAdapter {

    /**
     * this adapter layer is responsible for granting voltage to any device
     */

    public Voltage get240VoltFromSocket();

    public Voltage get120VoltFromSocket();

    public Voltage get60VoltFromSocket();

    public Voltage get3VoltFromSocket();

}
