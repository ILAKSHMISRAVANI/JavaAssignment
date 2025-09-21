package assignments;

public class TestTollBoothDemo {

	public static void main(String[] args) {
		
		TollBooth booth = new AlleghenyTollBooth();

        Truck mahi = new MahindraTruck(5, 12500);
        Truck jeeto = new JeetoTruck(2, 5000);

        booth.calculateToll(mahi);
        booth.calculateToll(jeeto);

        booth.collectReceipts();
        booth.displayData();
    }

}
