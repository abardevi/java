package live.once;

import java.io.File;

public class Filedelete {

	public static void main(String[] args) {
		// file delete
		File f= new File ("C:\\Users\\vinishka pranav\\Desktop\\sucess\\life\\achieve\\god.txt");
		if (f.exists()) {
			f.delete();
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("File not exists");
		}
	}

}
