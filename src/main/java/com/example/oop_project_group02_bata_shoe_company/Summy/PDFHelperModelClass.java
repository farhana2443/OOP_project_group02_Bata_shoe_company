package com.example.oop_project_group02_bata_shoe_company.Summy;

import org.openpdf.text.*;
import org.openpdf.text.pdf.PdfPTable;
import org.openpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

public class PDFHelperModelClass {

    public static <T> void generatePDF(
            String filePath,
            String title,
            String[] columnHeaders,
            List<T> data,
            List<Function<T, String>> extractors
    ) throws IOException, DocumentException {

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();

        Font titleFont = new Font(Font.HELVETICA, 18, Font.BOLD);
        Paragraph titleParagraph = new Paragraph(title, titleFont);
        titleParagraph.setAlignment(Element.ALIGN_CENTER);
        document.add(titleParagraph);
        document.add(new Paragraph(" ")); // Empty line

        PdfPTable table = new PdfPTable(columnHeaders.length);
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10f);


        for (String header : columnHeaders) {
            table.addCell(header);
        }


        for (T item : data) {
            for (Function<T, String> extractor : extractors) {
                table.addCell(extractor.apply(item));
            }
        }

        document.add(table);
        document.close();
    }
}
