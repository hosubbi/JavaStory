package homework230206;

public class Application03 {

	public static void main(String[] args) {
														//String docuProgram, String internetBrowser, String videoKind, String appKind
		PortableNotebook pNoteBook = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		pNoteBook.writeDocumentaion();
		pNoteBook.watchVideo();
		pNoteBook.changeMode();
		pNoteBook.useApp();
		pNoteBook.searchInternet();
	}

}
