package lld.designPatterns.structuralDesignPattern.facadeDesignPattern;

public class Client {
    public static void main(String[] args) {

        ReportFacade reportFacade = new ReportFacade();
        reportFacade.generateReport("HDFS", "CSV");
        reportFacade.generateReport("MONGODB", "PDF");

    }
}
