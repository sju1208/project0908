package project0908;
abstract class Car{
	int speed;
	String color;
	
	void upSpeed(int value) {
		speed=speed+value;
		//this.speed=this.speed+speed; int speed일 시
	}
	abstract void work(); //void가 오면 자식클래스에도 void작성 추상method
}	
	class Sedan extends Car{
		void work() {
			System.out.println("사람을 태웁니다.");		
	}
	
	class Truck extends Car{
		void work() {
			System.out.println("짐을 실습니다.");
			
		}
	}
		
	}

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
