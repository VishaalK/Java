import org.joda.time.*;
import org.joda.time.format.*;

public class Reservation {
	String name;
	String description;
	Interval interval;
	
	
	public Reservation(String name_, Interval interval_) {
		name = name_;
		description = "";
		interval = interval_;
	}

	public Reservation(String name_, Interval interval_, String description_) {
		name = name_;
		description = description_;
		interval = interval_;
	}

	public static void main(String[] args) {
		//year, month, day of month, hour, minute of hour
		DateTime start = new DateTime(2004, 12, 25, 5, 18);
		DateTime end = new DateTime(2005, 1, 1, 6, 17);
		
		
		//Interval i = new Interval(DateTime.parse(start.toString(), fmt), end);
		Reservation r = new Reservation("David Li", new Interval(start, end));
		//System.out.println("i: " + i);
		System.out.println(r);
		
		Reservation PR = new Reservation("Bianca Ng", new Interval(start, end), "For a PR meeting!");
		System.out.println(PR);
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		DateTimeFormatter fmt = DateTimeFormat.forPattern("HH:mm MM/dd");
		//result.append(System.getProperty("line.separator"));
		result.append(name + ": " + fmt.print(interval.getStart()) + " - " + fmt.print(interval.getEnd()));
		result.append(System.getProperty("line.separator"));
		if (description.equals("")) {
			result.append(" None");
		} else { //a description was specified 
			result.append(" " + description);
		}
		return result.toString();
	}

}
