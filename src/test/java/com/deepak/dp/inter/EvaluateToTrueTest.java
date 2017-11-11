package com.deepak.dp.inter;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaluateToTrueTest {

	@Test
	public void _3_operand_2_operator() throws Exception {
		BooleanEvaluator evaluator = new BooleanEvaluator();
		int count = evaluator.cnttrue("T|F&T");
		assertEquals(2, count);

	}
		
	@Test
	public void _4_operand_3_operator() throws Exception {
		BooleanEvaluator evaluator = new BooleanEvaluator();
		int count = evaluator.cnttrue("F|T^T&F");
		assertEquals(2, count);

	}

}
