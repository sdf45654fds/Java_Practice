
public class Engine {
	public String type; // 엔진타입
	public int cc; // 엔진배기량

	public Engine() {
	}

	public Engine(String type, int cc) {
		super();
		this.type = type;
		this.cc = cc;
	}

	public void print() {
		System.out.println(type + "\t" + cc);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

}