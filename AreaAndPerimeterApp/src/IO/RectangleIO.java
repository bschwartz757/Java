package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Rectangle.Rectangle;

public class RectangleIO {

	public static final String filename = "rectangles.txt";
	
	public static void save(Rectangle r){
		try(PrintWriter out = new PrintWriter(
				new BufferedWriter(
				new FileWriter(filename, true)))){
			out.println(r.getLength() + "|" +
				r.getWidth() + "|" +
				r.getArea() + "|" +
				r.getPerimeter());
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
	public static void printFile(){
		try(BufferedReader in = new BufferedReader(
				new FileReader(filename))){
			String line = in.readLine();
			while(line != null){
				System.out.println(line);
				line = in.readLine();
			}
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
