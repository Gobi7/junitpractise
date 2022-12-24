package JunitPractice;

import java.util.Iterator;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FlipkartMobile .class,TvSearch.class})

public class TestRunner {
	public static void main(String[] args) {
		
		
		
		/*
		 * Result rc = JUnitCore.runClasses(FlipkartMobile.class,TvSearch.class);
		 * System.out.println("total methods :"+rc.getRunCount());
		 * System.out.println("total time taken:" +rc.getRunTime());
		 * System.out.println("total failures :"+rc.getFailureCount());
		 * 
		 * 
		 * List<Failure> fail = rc.getFailures(); for (Failure failure : fail) {
		 * System.out.println(failure); System.out.println(failure.getTrimmedTrace());
		 */
		 
		 
	}
		
	}

