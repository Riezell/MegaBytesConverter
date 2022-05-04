package com.UdemyChallenge2;

public class MegaBytesConverter {
	
	public static void printMegaBytesAndKiloBytes (int kiloBytes) {
		
		
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
			return;
		}
			
		int megaBytes = 0;
		int remainder = 0;
		
		megaBytes = kiloBytes / 1024;
		remainder = kiloBytes % 1024;
		
		System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
		
	}

}
