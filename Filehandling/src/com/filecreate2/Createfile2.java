package com.filecreate2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Createfile2 {
//using file_output_stream
	public static void main(String[] args)
	{
		

	}
        public void newfile() throws IOException
        {
        	String strname="",strpath="";
        	
        	BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("Enter file name");
        	strname=Br.readLine();
        	System.out.println("Enter file path");
        	strpath=Br.readLine() ;     
        
        	FileOutputStream fos= new FileOutputStream(strname+""+ strpath+);
        	System.out.println("file created successfully");
        }
}
