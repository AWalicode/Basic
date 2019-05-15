package com.wostal.basic;

public class Starter {

	public static void main(String[] args) {
		
		/*
		 * Save string to CSV file
		 */
		Repository repository = new Repository();
		String exportString;
		exportString = PrepareService.mapToCsvExportString(repository.getData());
		if(Exporter.stringToCsv(exportString)) {
			System.out.println("Zapisano dane do pliku csv");
		}else {
			System.out.println("Nie uda³o siê zapisaæ danych");
		}
		
		/*
		 * String checker
		 */
		String str = "123v,erpo45,3pg,54pora";
		if(StringChecker.isFirstSymbolsNumeric(str, 3) && StringChecker.isLastSymbolsLetter(str, 4)) {
			System.out.println("Pierwsze 3 znaki w stringu s¹ cyframi i ostatnie 4 znaki s¹ literami.");
		}else{
			System.out.println("Podany string nie pasuje do wzorca.");
		}
	}

}
