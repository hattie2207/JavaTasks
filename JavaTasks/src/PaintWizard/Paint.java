package PaintWizard;

public class Paint {
	
	private String paintBrand;
	private int volume, coverSpace;
	private double price;
	
	public Paint(String paintBrand, int volume, double price, int coverSpace) {
		
		this.paintBrand = paintBrand;
		this.volume = volume;
		this.price = price;
		this.coverSpace = coverSpace;
		
	}
		
	public String getPaintBrand() {
		return paintBrand;
	}

	public int getVolume() {
		return volume;
	}

	public double getPrice() {
		return price;
	}

	public int getCoverSpace() {
		return coverSpace;
	}

	public String toString() {
		return "Paint Brand: " + this.getPaintBrand() + " Volume: " + this.getVolume() + 
				" Litre" + " Price: £" + this.getPrice() + " Cover Space: " + 
				this.getCoverSpace() + "m^2";
	}

}
