package lld.designPatterns.structuralDesignPattern.facadeDesignPattern;

public class HDFSReportGenerator {

    public void createConnection() {
        System.out.println("Creating connection with HDFS");
    }

    public void generateCSVReport() {
        System.out.println("Generating CSV report from HDFS");
    }

    public void generatePDFReport() {
        System.out.println("Generating PDF report from HDFS");
    }

}
