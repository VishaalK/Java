public class RoomReservation {
	private LocalDateTimeInterval period;
	private String name;
	
	//only one constructor possible
	RoomReservation(String name_, LocalDateTimeInterval period_) {
		name = name_;
		period = period_;
	}
	
	public static void main(String[] args) {
		System.out.println("I'm a reservation!");
		
	}

}
