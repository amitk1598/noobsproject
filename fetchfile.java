package project1;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class fetchfile {

	public static String path;

	fetchfile() throws Exception {

		File file = new File("C://Users//fameer foodie//Desktop//abcd.txt");
		FileReader fr = new FileReader(file);
		try {
			int first;
			while ((first = fr.read()) != 10) {
				path = path + (char) first;
			}
			System.out.println(path);
			
		} catch (Exception e) {
			System.out.println("file not found ");
		} finally {
			if (fr != null) {
				fr.close();
			}}}
	public static void listf(String directoryName){
		File directory = new File(directoryName);
		File [] fList = directory.listFiles();
		for(File file : fList){
			if(file.isFile()){
			System.out.println("File name: " +file.getName()+"File path: " +file.getAbsolutePath());
		}else if(file.isDirectory()){
			listf(file.getAbsolutePath());
		}}}
	public void path(){
		
	}
	public static void main(String[] args) throws Exception {
		fetchfile ob = new fetchfile();
         ob.listf(path.substring(0,path.length()-1));
         ob.path();
	}
}
