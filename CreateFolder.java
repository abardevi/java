package live.once;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		// TO create folder name as success in desktop
		
		File f = new File ("C:\\Users\\vinishka pranav\\Desktop\\sucess");
		
		if (f.exists()) {
			System.out.println("File already exists");
		}
		else {
			f.mkdir();
			System.out.println("File created");
		}

	}

}
