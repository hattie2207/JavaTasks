package PaintWizard;

import java.util.ArrayList;

public class PaintWizard {

	private static String leastWaste(double roomSize, ArrayList<Paint> paintList) {
		
		double tempt = 0;
		double leastWaste = 0;
		String leastWasteBrand = "";

		for (Paint p : paintList) {

			tempt = (roomSize / p.getCoverSpace()) * p.getVolume();	
			if (leastWaste == 0) {
				leastWaste = tempt;
				leastWasteBrand = p.getPaintBrand();
			}
			else if (tempt < leastWaste) {
				leastWaste = tempt; 
				leastWasteBrand = p.getPaintBrand();
			}
			else {

			}

		}
		
		return leastWasteBrand + " waste the least and use total paint of " + leastWaste +
				" Litres";
	}

	private static String calculateCheapest(double roomSize, ArrayList<Paint> paintList) {

		double tempt = 0; 
		double cheapest = 0;
		String cheapestBrand = ""; 

		for (Paint p : paintList) {

			tempt = (roomSize / p.getCoverSpace()) * p.getPrice();
			if (cheapest == 0) {
				cheapest = tempt;
				cheapestBrand = p.getPaintBrand();
			}
			else if (tempt < cheapest) {
				cheapest = tempt; 
				cheapestBrand = p.getPaintBrand();
			}
			else {

			}

		}

		return "The cheapest paint to buy for any room is " + cheapestBrand;

	}

	public static void main(String[] args) {

		double roomSize = 50;
		String outputMessage = ""; 
		ArrayList<Paint> paintList = new ArrayList<Paint>();

		Paint paintOne = new Paint("CheapoMax", 20, 19.99, 10);
		Paint paintTwo = new Paint("AverageJoes", 15, 17.99, 11);
		Paint paintThree = new Paint("DuluxourousPaints", 10, 25, 20);

		paintList.add(paintOne);
		paintList.add(paintTwo);
		paintList.add(paintThree);		

		outputMessage = leastWaste(roomSize, paintList);
		System.out.println(outputMessage);
		outputMessage = calculateCheapest(roomSize, paintList);
		System.out.println(outputMessage);
	}

}
