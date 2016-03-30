package creational.factory_method.document;

public class DocumentFactory {

    public Document getInstance(String docIdentifier){
        switch(docIdentifier){
            case "XML": return new XMLDocument();
            case "PDF": return new PDFDocument();
            case "CSV": return new CSVDocument();
        }
        return null;
    }

    public static void main(String[] args) {
        XMLDocument xmlDocument=(XMLDocument) new DocumentFactory().getInstance("XML");
        //Similarly creates an instance of PDF document
        PDFDocument pdfDocument=(PDFDocument) new DocumentFactory().getInstance("PDF");
    }
}
