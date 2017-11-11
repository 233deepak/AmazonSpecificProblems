package com.deepak.dp.inter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class BreakingWord2Test {

	@Test
	public void _break_word_10() throws Exception {
		BreakingWord breakingWord = new BreakingWord();
		ArrayList<String> wordBreaks = breakingWord.wordBreak(
				"catsanddog",
				new ArrayList<String>(Arrays.asList("cat", "cats", "and",
						"sand", "dog")));
		
		assertEquals(2, wordBreaks.size());
	}
	
	@Test
	public void _break_word_100() throws Exception {
		BreakingWord breakingWord = new BreakingWord();
		ArrayList<String> wordBreaks = breakingWord.wordBreak(
				"bbabbbababbaabaabbabbabaa",
				new ArrayList<String>(Arrays.asList("abaabaaabb", "ab", "a", "b", "aabbbbbabb", "abaabb", "babbaa", "bbabab", "aa" )));
		
		assertEquals(424, wordBreaks.size());
	}

}
