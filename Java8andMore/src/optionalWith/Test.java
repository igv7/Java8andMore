package optionalWith;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		Team myLoveClass = generateData();

		for (Student s : myLoveClass.getStudents()) {
			if (s.getTeacher().isPresent()) {
				s.getTeacher().get().agenda();
			}else {
				System.out.println("Teacher N/A");
			}
		}

	}

	public static Team generateData() {
		Team team = new Team(110, 3, 308);

		Student levi = new Student(100, "Levi the Prince");
		levi.addSkill(new Skill("LinkedIn", 10));
		levi.setTeacher(Optional.of(new Teacher(123, "Yaakov")));

		Student sean = new Student(200, "Sean the King");
		sean.addSkill(new Skill("LinkedIn", 9));
		sean.addSkill(new Skill("AOP", 10));
		sean.setTeacher(Optional.of(new Teacher(123, "Yaakov")));

		Student zamir = new Student(300, "Zamir The Lion");
		zamir.addSkill(new Skill("C#"));
		zamir.addSkill(new Skill("Spring", 10));
		// missing Teacher

		team.addStudent(levi);
		team.addStudent(sean);
		team.addStudent(zamir);

		return team;

	}

}