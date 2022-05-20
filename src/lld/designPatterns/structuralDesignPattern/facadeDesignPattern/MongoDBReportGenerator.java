package lld.designPatterns.structuralDesignPattern.facadeDesignPattern;

public class MongoDBReportGenerator {

    public void createConnection() {
        System.out.println("Creating connection with MongoDB");
    }

    public void generateCSVReport() {
        System.out.println("Generating CSV report from MongoDB");
    }

    public void generatePDFReport() {
        System.out.println("Generating PDF report from MongoDB");
    }

}
