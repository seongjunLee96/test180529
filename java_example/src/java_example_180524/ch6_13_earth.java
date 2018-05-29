package java_example_180524;
//상수 선언
public class ch6_13_earth {
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
}
