package Sparky;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.SparkConf;

@WebServlet(value = "/working")
public class WorkingServlet extends HttpServlet {
	//JavaSparkContext cont;
	//JavaRDD<String> dataSetRDD;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		try {
			res.getWriter().println("I am working.");
			
		//	JavaRDD<String> dataSetRDD = cont.textFile("ASheet.csv");
		//	JavaRDD<Integer> dataSetLines = dataSetRDD.map( f -> f.length() );
		//	res.getWriter().println(dataSetRDD);
		} finally {
			
		}
	}
	
	@Override
	public void init() throws ServletException {
		//JavaSparkContext cont;
		JavaRDD<String> dataSetRDD;
		SparkConf conf = new SparkConf().setAppName("CsvTest").setMaster("local");
		//cont = new JavaSparkContext(conf);
		//dataSetRDD = cont.textFile("ASheet.csv");
		
	}

}
