package lld.designPatterns.structuralDesignPattern.adapterDesignPattern;

public class AdapterTest {

    public static void main(String[] args) {

        SocketVoltageAdapterImpl adapter = new SocketVoltageAdapterImpl();
        Voltage v3 = adapter.get3VoltFromSocket();
        Voltage v120 = adapter.get120VoltFromSocket();
        System.out.println(v3);
        System.out.println(v120);

    }
}
