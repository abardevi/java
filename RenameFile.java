package live.once;

import java.io.File;
import java.io.IOException;

public class RenameFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f= new File("C:\\Users\\vinishka pranav\\Desktop\\sucess\\life\\achieve\\god.txt");
f.createNewFile();
File f1=new File("C:\\Users\\vinishka pranav\\Desktop\\sucess\\life\\achieve\\happy.txt");
f.renameTo(f1);
	}

}
