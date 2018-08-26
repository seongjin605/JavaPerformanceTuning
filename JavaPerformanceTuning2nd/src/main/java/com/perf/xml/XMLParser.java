package com.perf.xml;

import java.util.concurrent.TimeUnit;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import com.perf.xml.dom.ParseDOM;
import com.perf.xml.sax.ParseSAX;

@State(Scope.Thread)
@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class XMLParser {
	
	@Benchmark
	public void withDOMParse100() {
			ParseDOM pd=new ParseDOM();
			pd.parseDOM("dummy100.xml");
	}
	
	@Benchmark
	public void withDOMParse1000() {
		ParseDOM pd=new ParseDOM();
		pd.parseDOM("dummy1000.xml");
	}
	
	@Benchmark
	public void withSAXParse100() throws Exception {
			ParseSAX handler = new ParseSAX();
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse("dummy100.xml", handler );
	}
	
	@Benchmark
	public void withSAXParse1000() throws Exception {
		ParseSAX handler = new ParseSAX();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		saxParser.parse("dummy1000.xml", handler );
	}
}