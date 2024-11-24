package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths; 

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename = "D:\\2024.1\\OOP\\lab\\OtherProjects\\hust\\soict\\dsai\\garbage\\952720d0-29bd-4d88-8985-c525cc8ab685.jpg";
		
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte b : inputBytes) {
			outputStringBuilder.append((char) b);
		}
		String output = outputStringBuilder.toString();
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
