package computer;

//노트북을 상속받음 
public class MyNoteBook extends NoteBook {

	@Override
	public String display() {
		System.out.println("노트북 모니터에 출력합니다. ");
		return null;
	}

}
