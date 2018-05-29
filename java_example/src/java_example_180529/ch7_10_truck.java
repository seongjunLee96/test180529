package java_example_180529;

public class ch7_10_truck extends ch7_10_car{

	private int capacity;
	
	public ch7_10_truck(int speed, String color, int capacity) {
		super(speed, color);
		this.capacity = capacity;
	}


	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
