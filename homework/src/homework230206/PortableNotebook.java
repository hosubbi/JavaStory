package homework230206;

public class PortableNotebook implements Notebook,Tablet{
	int MODE = NOTEBOOK_MODE;
	String docuProgram;
	String internetBrowser;
	String videoKind;
	String appKind;
	
//	public PortableNotebook(int MODE) {
//		if(MODE == NOTEBOOK_MODE) {
//			System.out.println("NOTEBOOK_MODE");
//		} else if(MODE == TABLET_MODE) {
//			System.out.println("TABLET_MODE");
//		}
//	}
	
	public PortableNotebook (String docuProgram, String internetBrowser, String videoKind, String appKind) {
		if(MODE == NOTEBOOK_MODE) {
			System.out.println("NOTEBOOK_MODE");
		} else if(MODE == TABLET_MODE) {
			System.out.println("TABLET_MODE");
		}
		this.docuProgram = docuProgram;
		this.internetBrowser = internetBrowser;
		this.videoKind = videoKind;
		this.appKind = appKind;
	}
	
	@Override
	public void watchVideo() {
		System.out.println(videoKind + "를 시청");
	}

	@Override
	public void useApp() {
		if(MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println(appKind + "를 실행");
		}else if(MODE == TABLET_MODE) {
			System.out.println(appKind + "를 실행");
		}
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(docuProgram + "을 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(internetBrowser + "를 통해 인터넷을 검색");
	}
	
	public void changeMode() {
		if(MODE == 1) {
			MODE = 2;
			System.out.println("TABLET_MODE");
		}else if(MODE == 2){
			MODE = 1;
			System.out.println("NORMAL_MODE");
		}				
	}
}
