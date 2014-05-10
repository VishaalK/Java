import org.joda.time.*;

import java.awt.Point;
import java.util.Set;
import java.util.TreeSet;

public class Room {
	//variables
	private String name;
	private Point location;
	private Set<Integer> reservations;
	//private Set<Room
	
	public static void main(String[] args) {
		System.out.print("I'm a room!\n");
	
		LocalDateTime now = new LocalDateTime();
		//System.out.println(now);
		System.out.println(now.toString("hh:mm:SS MM/dd/YYYY"));
		System.out.println(new Point(5,5));
		Room a = new Room("Magic");
		a.add_reservation(5);
	}
	
	//constructor with default location
	public Room(String name_) {
		name = name_;
		location = new Point(0,0);
		reservations = new TreeSet<Integer>();
		
	}
	
	public Room(String name_, Point p_) {
		name = name_;
		location = p_;
		reservations = new TreeSet<Integer>();
	}
	
	//public interface
	public String get_name() {
		return name;
	}
	
	public Point get_location() {
		return location;
	}
	
	public void add_reservation(int x) {
		reservations.add(x);
		System.out.println(x + " was added");
	}
	public void add_reservation(LocalDateTime start, LocalDateTime end) {
		System.out.println("Do nothing for now");
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(name + " Location: (" + location.x + ", " + location.y + ")");
		result.append(System.getProperty("line.separator"));
		if (!reservations.isEmpty()) {
			for (int i: reservations) {
				result.append(i + " ");
			}
			result.append(System.getProperty("line.separator"));
		}
		return result.toString();
	}
}
