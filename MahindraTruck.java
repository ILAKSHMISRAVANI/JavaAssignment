package assignments;

//Truck Interface
interface Truck {

	int getAxles();
	int getTotalWeight();
	String getMake();

}

public class MahindraTruck implements Truck{


	private int axles;
	private int totalWeight;
	protected final String make = "Mahindra";

	public MahindraTruck(int axles, int totalWeight) {
		this.axles = axles;
		this.totalWeight = totalWeight;
	}

	@Override
	public int getAxles() {
		return axles;
	}

	@Override
	public int getTotalWeight() {
		return totalWeight;
	}

	@Override
	public String getMake() {
		return make;
    }


}

class JeetoTruck implements Truck{

	private int axles;
	private int totalWeight;
	protected final String make = "Jeeto";

	public JeetoTruck(int axles, int totalWeight) {
		this.axles = axles;
		this.totalWeight = totalWeight;
	}

	@Override
	public int getAxles() {
		return axles;
	}

	@Override
	public int getTotalWeight() {
		return totalWeight;
	}

	@Override
	public String getMake() {
		return make;
	}
}




