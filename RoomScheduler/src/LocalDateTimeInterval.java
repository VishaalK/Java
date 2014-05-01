import org.joda.time.*;

public class LocalDateTimeInterval {
	private LocalDateTime start_time;
	private LocalDateTime end_time;
	
	//constructor 
	public LocalDateTimeInterval(LocalDateTime start, LocalDateTime end) {
		start_time = start;
		end_time = end;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I'm an interval!");
	}

}
