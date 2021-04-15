package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generateJvmReport(String jsonPath) {
	//1.Mention the folder location
	File f=new File(System.getProperty("user.dir")+"\\target\\Reports\\JvmReport");
	//2.Add details to the report
	Configuration con=new Configuration(f,"Facebook Application");
	//3.convert String into List<String>
	List<String> li=new ArrayList <String>();
	li.add(jsonPath);
	//4.Call generateReport() method from ReportBuilder Class
	ReportBuilder r= new ReportBuilder(li,con);
	r.generateReports();
}
}
