package org.jvmrepo;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Generatejvm {
	
	public static void report(String jasonfilepath) {
		
		File f =new File("C:\\Users\\Admin\\OneDrive\\Desktop\\repo\\Project-1\\src\\test\\resources");
		
		Configuration c = new Configuration(f, "BlueLynx Report");
		
		c.addClassifications("browser", "Google chrome");
		
		c.addClassifications("os", "windows10");
		
		c.addClassifications("sprint no ", "1");
		
		java.util.List<String> l = new ArrayList<String>();
		
		l.add(jasonfilepath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		
		r.generateReports();
		

	}

}
