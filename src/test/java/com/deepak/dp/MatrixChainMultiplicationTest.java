package com.deepak.dp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatrixChainMultiplicationTest {

	private MatrixChainMultplier matrixChainMultplier;

	@Before
	public void set() {
		matrixChainMultplier = new MatrixChainMultplier();
	}

	@Test
	public void chainWithOneMatrix() throws Exception {
		int p[] = { 10, 20 };
		int cost = matrixChainMultplier.multiply(1, p);
		assertEquals(0, cost);

	}

	@Test
	public void chainWit6Matrix() throws Exception {
		int p[] = { 30, 35, 15, 5, 10, 20, 25 };
		int cost = matrixChainMultplier.multiply(6, p);
		assertEquals(15125, cost);

	}

}
