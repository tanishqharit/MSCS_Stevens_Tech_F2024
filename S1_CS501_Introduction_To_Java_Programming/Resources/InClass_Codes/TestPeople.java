package Resources.InClass_Codes;

public class TestPeople {

	public static void main(String[] args) {
		Person p1 = new Person("John Smith Jr", "10 Main St", 2020);
		Person p2 = new Person("John Smith Sr", "10 Main St", 2000);
		System.out.println(p1.canVote());
		System.out.println(p2.canVote());
	}
}
