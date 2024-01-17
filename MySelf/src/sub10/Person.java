package sub10;

public class Person {
	public Member getMember(Createable1 createable) {
		String id = "winter";
		Member member = createable.create(id);
		return member;
	}

	public Member getMember2(Createable2 createable) {
		String id="winter";
		String name="한겨울";
		Member member = createable.create(id, name);
		return member;
		
	}
}
