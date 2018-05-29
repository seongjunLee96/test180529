package java_example_180529;

public class ch7_10_sedan extends ch7_10_car{
	public ch7_10_sedan(int speed, String color) {
		super(speed, color);
	}

	private int seatNum;

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
}
