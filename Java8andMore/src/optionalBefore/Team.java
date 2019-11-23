package optionalBefore;

import java.util.ArrayList;
import java.util.List;

public class Team {

	private int id;
	private int floor;
	private int room;
	private List<Student> students = new ArrayList<Student>();
	
	public Team(int id, int floor, int room) {
		super();
		this.id = id;
		this.floor = floor;
		this.room = room;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	
}