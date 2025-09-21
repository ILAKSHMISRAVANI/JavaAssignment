package assignments;

interface TollBooth {

	void calculateToll(Truck truck);
	void displayData();
	void collectReceipts();

}

//AlleghenyTollBooth.java
public class AlleghenyTollBooth implements TollBooth {
	
 private int totalTrucks;
 private int totalReceipts;

 @Override
 public void calculateToll(Truck truck) {
     int tollDue = (truck.getAxles() * 5) + ((truck.getTotalWeight() / 500) * 10);
     totalReceipts += tollDue;
     totalTrucks++;

     System.out.println("Arrival of " +truck.getMake()+ " Truck");
     System.out.println("Truck arrival - Axles: " + truck.getAxles() +
             " Total weight: " + truck.getTotalWeight() +
             " Toll due: $" + tollDue);
 }

 @Override
 public void displayData() {
     System.out.println("\nTotals since last collection - Receipts: $" +
             totalReceipts + " Trucks: " + totalTrucks);
 }

 @Override
 public void collectReceipts() {
     System.out.println("\n*** Collecting receipts  ***");
     System.out.println("Totals since the last collection - Receipts: $" +
             totalReceipts + " Trucks: " + totalTrucks);

     // Resetting
     totalReceipts = 0;
     totalTrucks = 0;
     System.out.println("\n***** Reset Receipts **********");

 }
}
