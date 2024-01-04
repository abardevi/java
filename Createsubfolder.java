package live.once;

import java.io.File;

public class Createsubfolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File ("C:\\Users\\vinishka pranav\\Desktop\\sucess\\life\\achieve");
		
		if (f.exists()) {
			System.out.println("File already exists");
		}
		
		else {
			f.mkdirs();
			System.out.println("File created");
		}
	}
	
	
	

}
