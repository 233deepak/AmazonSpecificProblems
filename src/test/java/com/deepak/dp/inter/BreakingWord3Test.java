package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class BreakingWord3Test {

	@Test
	public void _18_length_string() throws Exception {

		BreakingWord2 breakingWord = new BreakingWord2();
		int canBreak = breakingWord.wordBreak(
				"myinterviewtrainer",
				new ArrayList<String>(Arrays.asList("interview", "my",
						"trainer")));

		assertEquals(1, canBreak);

	}

	@Test
	public void _19_length_string() throws Exception {

		BreakingWord2 breakingWord = new BreakingWord2();
		int canBreak = breakingWord.wordBreak(
				"catsanddog",
				new ArrayList<String>(Arrays.asList("cat", "cats", "and",
						"sand", "dog")));

		assertEquals(1, canBreak);

	}

	@Test
	public void _20_length_string() throws Exception {

		BreakingWord2 breakingWord = new BreakingWord2();
		int canBreak = breakingWord
				.wordBreak(
						"bbabbbababbaabaabbabbabaa",
						new ArrayList<String>(Arrays.asList("abaabaaabb", "ab",
								"a", "b", "aabbbbbabb", "abaabb", "babbaa",
								"bbabab", "aa")));

		assertEquals(1, canBreak);

	}

}
