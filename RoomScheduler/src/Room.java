import org.joda.time.*;

public class Room {
	//variables
	private String name;
	
	public static void main(String[] args) {
		System.out.print("I'm a room!\n");
	
		LocalDateTime now = new LocalDateTime();
		//System.out.println(now);
		System.out.println(now.toString("hh:mm:SS MM/dd/YYYY"));
	}
	
	//public interface
	public String get_name() {
		return name;
	}
	

}
