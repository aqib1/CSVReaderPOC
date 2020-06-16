package com.parser.processor;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CSVParser {

	public CSVParser() {

	}

	public <T> List<T> readCSV(Class<T> c, String path) throws IOException {
		CsvMapper mapper = new CsvMapper();
		CsvSchema schema = mapper.schemaFor(c).withColumnSeparator(',').withNullValue("");
		MappingIterator<T> mi = mapper.readerFor(c).with(schema).readValues(new File(path));
		return mi.readAll();
	}

}
