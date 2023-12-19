public class Car {
	public int no; // 차량번호
	public String model;// 차량모델명
	public Engine engine; // 엔진객체주소를 저장할 멤버필드

	public Car() {
	}

	public Car(int no, String model, Engine engine) {

		this.no = no;
		this.model = model;
		this.engine = engine;
	}

	public void print() {
		System.out.println(no + "\t" + model + "\t" + this.engine);
		engine.print();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}