package java_example_180531;

public class ch8_04_tank implements ch8_04_car, ch8_04_cannon{

	@Override
	public void fire() {
		System.out.println("탱크가 대포를 발사합니다.");
	}

	@Override
	public void work() {
		System.out.println("탱크가 앞으로 전진합니다.");
	}
	
}
