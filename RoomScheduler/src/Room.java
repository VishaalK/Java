import org.joda.time.*;

public class Room {

	public static void main(String[] args) {
		System.out.print("I'm a room!\n");
	
		LocalDateTime now = new LocalDateTime();
		//System.out.println(now);
		System.out.println(now.toString("hh:mm:SS MM/dd/YYYY"));
	}

}
