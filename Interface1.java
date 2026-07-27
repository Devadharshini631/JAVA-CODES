interface camera {
	void photo();

}
interface music {
	void playmusic();
}
class mobile implements camera {
	public void photo() {
		System.out.println("photo taken");
	}
	public void music() {
System.out.println("music playing");
	}
}
	public class Main {
		public static void main(String[] args) {
		    mobile m=new mobile();
		    m.photo();
		    m.music();
			
		}		
	}
