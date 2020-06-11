package com.parser.processor;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.parser.models.CourseModel;

public class CSVParser {

	public CSVParser() {

	}

	public List<CourseModel> readCourseCSV(String path) throws IOException {

		try (FileReader reader = new FileReader(path)) {
			CsvMapper mapper = new CsvMapper();
			CsvSchema schema = mapper.schemaFor(CourseModel.class).withColumnSeparator(',').withNullValue("");
			MappingIterator<CourseModel> mi = mapper.readerFor(CourseModel.class).with(schema).readValues(reader);
			return mi.readAll();
		}
	}

}
