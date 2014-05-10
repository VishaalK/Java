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
		LocalDateTime start = new LocalDateTime();
		LocalDateTime end = new LocalDateTime();
		LocalDateTimeInterval test = new LocalDateTimeInterval(start, end);
		System.out.println("Reservation: " + test);
	}
	

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(start_time.toString() + " - " + end_time.toString());
		return result.toString();
	}
}
