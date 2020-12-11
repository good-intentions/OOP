package simeon;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		System.out.println(t1.toString());
		Time t2 = new Time(555550000);
		System.out.println(t2.toString());
		Time t3 = new Time(5, 23, 55);
		System.out.println(t3.toString());
	}

}
