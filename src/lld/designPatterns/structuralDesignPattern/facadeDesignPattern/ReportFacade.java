package lld.designPatterns.structuralDesignPattern.facadeDesignPattern;

public class ReportFacade {

    public void generateReport(String dataSourceType, String reportType) {

        if(dataSourceType.equals("HDFS")) {

            HDFSReportGenerator hdfsReportGenerator = new HDFSReportGenerator();
            hdfsReportGenerator.createConnection();

            if(reportType.equals("CSV")) {
                hdfsReportGenerator.generateCSVReport();
            } else {
                hdfsReportGenerator.generatePDFReport();
            }

        } else if(dataSourceType.equals("MONGODB")){

            MongoDBReportGenerator mongoDBReportGenerator = new MongoDBReportGenerator();
            mongoDBReportGenerator.createConnection();

            if(reportType.equals("CSV")) {
                mongoDBReportGenerator.generateCSVReport();
            } else {
                mongoDBReportGenerator.generatePDFReport();
            }
        }
    }
}
