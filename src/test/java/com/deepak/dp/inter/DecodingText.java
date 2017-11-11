package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecodingText {

	
	@Test
	public void textWithLength3() throws Exception {
		Decoder decoder =new Decoder();
		int ways =decoder.numDecodings("326");
		assertEquals(2, ways);
		
	}
	
	@Test
	public void textWithLength12() throws Exception {
		Decoder decoder =new Decoder();
		int ways =decoder.numDecodings("12");
		assertEquals(2, ways);
		
	}
	
	@Test
	public void textWithLength328() throws Exception {
		Decoder decoder =new Decoder();
		int ways =decoder.numDecodings("328");
		assertEquals(1, ways);
		
	}
	
	@Test
	public void textWithLengt4122() throws Exception {
		Decoder decoder =new Decoder();
		int ways =decoder.numDecodings("4122");
		assertEquals(3, ways);
		
	}
	
	@Test
	public void invalid() throws Exception {
		Decoder decoder =new Decoder();
		int ways =decoder.numDecodings("0");
		assertEquals(0, ways);
		
	}
}
