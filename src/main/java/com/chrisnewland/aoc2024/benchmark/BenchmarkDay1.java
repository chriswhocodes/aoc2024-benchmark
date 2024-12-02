package com.chrisnewland.aoc2024.benchmark;

import com.chrisnewland.aoc2024.Day1;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
public class BenchmarkDay1
{
	private static List<String> lines;

	static
	{
		try
		{
			lines = Files.readAllLines(Paths.get("/home/chris/IdeaProjects/aoc2024/src/main/resources/2024/day1.txt"));
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Benchmark
	public void testDay1Part2Simple(Blackhole bh)
	{
		Day1 day1 = new Day1(lines);

		bh.consume(day1.part2Simple());
	}

	@Benchmark
	public void testDay1Part2Optimised(Blackhole bh)
	{
		Day1 day1 = new Day1(lines);

		bh.consume(day1.part2Optimised());
	}
}