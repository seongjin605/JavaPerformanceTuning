package com.perf.json;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class JSONParser {

	@Benchmark
	public void parseStream100(){
		ParseJSON pj=new ParseJSON();
		pj.parseStream("dummy100.json");
	}
	@Benchmark
	public void parseStream1000(){
		ParseJSON pj=new ParseJSON();
		pj.parseStream("dummy1000.json");
	}

}