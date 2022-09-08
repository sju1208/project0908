package project0908;

class Car{
	private String color;
	int speed;
	Car(){
		System.out.println("Car의 생성자");
	}
	
	Car(String str){
		System.out.println("매개변수가 있는 생성자"+str);
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void upSpeed(int value) {
		speed=speed+value;
		System.out.println("현재 속도(부모클래스) : " +speed);
		if(speed>150) {
			speed=150;
			//System.out.print(false);
		}
	}
	
	void downSpeed(int value) {
		speed=speed-value;
	}
}
class Sedan extends Car{
	int seatNum;
	Sedan(){
		System.out.println("Sedan의 생성자");
	}
	Sedan(String str){
		System.out.println("Sedan의 매개변수 생성자"+str);
	}
	void upSpeed(int value) {
		super.upSpeed(speed);
		speed=speed+value;
		if(speed>150) {
			speed=150;
		
		}
	}
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
}
class Truck extends Car{
	int capacity;
	Truck(){
		System.out.println("Truck의 생성자");
	}
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
public class CarEx {

	public static void main(String[] args) {
		Sedan sedan1=new Sedan();
		sedan1.upSpeed(200);
		//Car car1=new Car("여기는 부모클래스 생성자");
		//sedan1.color="red";
		//sedan1.setColor("red");//private 사용가능
		Sedan sedan2=new Sedan("여기요");
		
		 sedan1.setColor("빨강"); sedan1.setSpeed(150); sedan1.setSeatNum(5); 
		 System.out.printf("색상: %s, 속도: %d, 좌석 수: %d\n",
		 sedan1.getColor(),sedan1.getSpeed(),sedan1.getSeatNum());
		 
		
		/*
		 * Truck truck1=new Truck(); truck1.setColor("파랑"); truck1.setSpeed(60);
		 * truck1.setCapacity(2500);
		 * 
		 * System.out.printf("색상: %s, 속도: %d, 적재량: %d\n",
		 * truck1.getColor(),truck1.getSpeed(),truck1.getCapacity());
		 */

	}

}
