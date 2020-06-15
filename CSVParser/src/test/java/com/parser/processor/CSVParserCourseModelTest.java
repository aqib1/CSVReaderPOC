package com.parser.processor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.parser.models.CourseModel;
import com.parser.models.Test1;

public class CSVParserCourseModelTest {

	private static final String COURSES_CSV = "course.csv";
	private CSVParser csvParser;

	@Before
	public void init() {
		csvParser = new CSVParser();
	}

	@Test
	public void testReadCSV() throws FileNotFoundException, IOException {
		List<CourseModel> result = csvParser.readCourseCSV(COURSES_CSV);
//		List<CourseModel> expected = Arrays.asList(
//				new CourseModel("REST With Spring", "Eugen Paraschiv", 0, Test1.TONY, "str1", "str2", "str3"),
//				new CourseModel(null, "Baeldung", 0, Test1.IBM, "str1", "str2", "str3"),
//				new CourseModel("Complete Java MasterClass", null, 0, Test1.TONY, "str1", "str2", "str3")
//				);
		System.out.println(result);
//		Assert.assertEquals(expected.get(0), result.get(0));
//		Assert.assertEquals(expected.get(1), result.get(1));
//		Assert.assertEquals(expected.get(2), result.get(2));
	}

	@Test
	public void methods() throws NoSuchMethodException, SecurityException {
		Class<?> c = CSVParser.class;
		String readCSVMethodName = "readCourseCSV";
		Method readCSVMethod = c.getDeclaredMethod(readCSVMethodName, String.class);
		Assert.assertNotNull(readCSVMethod);

	}
}
