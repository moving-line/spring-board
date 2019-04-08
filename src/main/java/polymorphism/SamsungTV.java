package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> 샘숭TV 객체생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> 샘숭TV(2) 객체생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> 샘숭TV(3) 객체생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("객체 초기화작업처리...");
	}
	
	public void destoryMethod() {
		System.out.println("객체 삭제전 처리할 로직을,,,");
	}
	
	public void powerOn() {
		System.out.println("SamsungTv---전원 켠다.(가격 : " + price + ")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv---전원 끈다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}