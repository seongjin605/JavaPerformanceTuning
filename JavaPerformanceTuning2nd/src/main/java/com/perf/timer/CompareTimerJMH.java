package com.perf.timer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class CompareTimerJMH {

//	@Benchmark
//	public DummyData makeObjectWithSize10() {
//		HashMap<String, String> map = new HashMap<String, String>(10);
//		ArrayList<String> list = new ArrayList<String>(10);
//		return new DummyData(map, list);
//	}

	@Benchmark
	public DummyData makeObjectWithSize1000000() {
		HashMap<String, String> map = new HashMap<String, String>(1000000);
		ArrayList<String> list = new ArrayList<String>(1000000);
		return new DummyData(map, list);
	}


}
