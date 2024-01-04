package live.once;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File ("C:\\Users\\vinishka pranav\\Desktop\\sucess\\life\\achieve\\god.txt");
		
		if (f.exists()) {
			System.out.println("File already found");
		}
		else {
			f.createNewFile();
			System.out.println("file created successfully");
		}
	}

}
