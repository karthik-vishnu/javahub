package com.java.myprojects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class MySystem {

	public static PrintStream myMethod = null;
	
	
	public static void method(String x) {
		PrintStream ps;
		try {
			myMethod = new PrintStream("Hai hello");
			myMethod.println();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) throws Exception{
	//	myMethod.println("hai");
	//	System.out.println(Math.hypot(2.5, 2));
		int a = 25;
		
		String s = "as";
		
		System.out.println(s.contentEquals("asas"));
		
	}
}
