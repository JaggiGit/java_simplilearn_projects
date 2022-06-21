package mypackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Createfile
{
	public void Newfile() throws IOException
	{
		String strPath="",strName="" ;
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter file name =");
		strName=Br.readLine();
		System.out.println("Enter file path=");
		strPath=Br.readLine();
		
		File f1= new File(strPath+""+strName+".txt");
		f1.createNewFile();
	}
}
