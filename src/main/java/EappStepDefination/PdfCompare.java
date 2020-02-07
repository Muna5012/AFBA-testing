package EappStepDefination;

import de.redsix.pdfcompare.PdfComparator;

public class PdfCompare {

public static void main(String[] args) throws Exception {
		
		String file1 = "C:\\Users\\MAbabaikeli\\Downloads\\download.pdf";
		String file2 = "C:\\Users\\MAbabaikeli\\Downloads\\benefit_summary.pdf";
		String resultfile = "C:\\Users\\MAbabaikeli\\Downloads\\result";
				
		new PdfComparator(file1, file2).compare().writeTo(resultfile);
	
		boolean isEquals = new PdfComparator(file1, file2).compare().writeTo(resultfile);
		if (!isEquals) {
	    System.out.println("PDF files similar: " + isEquals);
	}
		System.out.println("Process Completed");
}
}