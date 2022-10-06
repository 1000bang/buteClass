package computer;

//상속받음 / 2번 노트북 클래스를 abstract로 만듦
public abstract class NoteBook extends Computer {

	@Override
	public String typing() {
		System.out.println("노트북 타이핑 합니다");
		return null;
	}

}
