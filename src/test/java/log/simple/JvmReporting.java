package log.simple;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReporting {
	public static void report(String args) {
		
		File file=new File("C:\\Users\\ELCOT\\eclipse-workspace\\basics\\Cucumber\\target");
		Configuration config=new Configuration(file, "adactinlogin");
		config.addClassifications("browser", "chrome");
		config.addClassifications("tester", "malathi");
		config.addClassifications("sprint", "2.0");
		//adding values to list
		List<String> li=new ArrayList<String>();
		li.add(args);
		ReportBuilder report=new ReportBuilder(li, config);
		report.generateReports();
		
		
		
		

	}

}
