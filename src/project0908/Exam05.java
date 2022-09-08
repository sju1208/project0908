package project0908;
interface Car1{
	static final int CAR_COUNT=0;
	
	abstract void work();
}
class Sedan1 implements Car1{
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}
class Truck1 implements Car1{
	public void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}
public class Exam05 {

	public static void main(String[] args) {
		Sedan1 sedan1=new Sedan1();
		sedan1.work();
		
		Truck1 truck1=new Truck1();
		truck1.work();
	}

}
