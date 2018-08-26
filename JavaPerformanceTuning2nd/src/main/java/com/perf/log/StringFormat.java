package com.perf.log;

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
public class StringFormat {
	String a="aaa",b="bbb",c="ccc";
	long d=1,e=2,f=3;
	String data;
	
	@Benchmark
	public void stringAdd() {
		data=a+" "+b+" "+c+" "+d+" "+e+" "+f;
	}
	
	@Benchmark
	public void stringFormat() {
		data=String.format("%s %s %s %d %d %d",a,b,c,d,e,f);
	}
}
