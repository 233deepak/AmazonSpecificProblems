package com.deepak.dp.inter;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {

	@Test
	public void _5_array() throws Exception {
		JumpGame game = new JumpGame();
		int canJump = game.canJump(new ArrayList<Integer>(Arrays.asList(2, 3,
				1, 1, 4)));
		Assert.assertEquals(1, canJump);
	}

	@Test
	public void _6_array() throws Exception {
		JumpGame game = new JumpGame();
		int canJump = game.canJump(new ArrayList<Integer>(Arrays.asList(10, 0,
				1, 1, 0)));
		Assert.assertEquals(1, canJump);
	}

	@Test
	public void _1_array() throws Exception {
		JumpGame game = new JumpGame();
		int canJump = game.canJump(new ArrayList<Integer>(Arrays.asList(10)));
		Assert.assertEquals(1, canJump);
	}
	
	@Test
	public void _invalid_array() throws Exception {
		JumpGame game = new JumpGame();
		int canJump = game.canJump(new ArrayList<Integer>(Arrays.asList(3,2,1,0,4)));
		Assert.assertEquals(0, canJump);
	}
	
	

	@Test
	public void _0_array() throws Exception {
		JumpGame game = new JumpGame();
		int canJump = game.canJump(new ArrayList<Integer>(Arrays.asList( 22, 0, 0, 3, 6, 0, 0, 0, 0, 0, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 22, 12, 0, 12, 0, 9, 11, 0, 0, 21, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 23, 0, 19, 0, 19, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 26, 0, 28, 3, 0, 0, 0, 19, 0, 0, 15, 0, 0, 14, 0, 0, 0, 0, 0, 7, 0, 14, 0, 16, 0, 19, 2, 16, 0, 29, 12, 0, 0, 0, 0, 29, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21, 9, 9, 0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0, 30, 0, 25, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 20, 30, 29, 0, 23, 17, 0, 0, 20, 0, 0, 0, 3, 17, 10, 0, 0, 0, 0, 0, 0, 15, 0, 0, 6, 0, 0, 0, 0, 0, 11, 2, 27, 0, 22, 0, 8, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0, 0, 0, 0, 0, 30, 25, 0, 0, 0, 0, 9, 29, 0, 0, 0, 0, 0, 1, 0, 16, 27, 0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 1, 0, 6, 0, 0, 0, 16, 0, 3, 0, 20, 10, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 3, 0, 17, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 10, 0, 0, 0, 5, 21, 15, 0, 0, 0, 23, 0, 17, 0, 0, 24, 0, 0, 7, 11, 1, 27, 0, 9, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 28, 0, 0, 0, 23, 0, 0, 0, 22, 0, 0, 3, 0, 17, 1, 19, 0, 0, 18, 0, 23, 0, 0, 0, 0, 13, 19, 24, 13, 0, 0, 0, 0, 0, 0, 3, 28, 0, 0, 5, 21, 0, 0, 0, 0, 0, 6, 0, 0, 0, 19, 0, 0, 0, 11, 5, 0, 0, 0, 24, 21, 0, 0, 0, 19, 0, 0, 0, 0, 10, 0, 17, 0, 0, 0, 2, 0, 24, 13, 1, 22, 0, 0, 15, 0, 21, 0, 21, 0, 0, 7, 0, 0, 0, 23, 6, 0, 0, 20, 24, 23, 0, 0, 0, 0, 28, 0, 8, 0, 0, 30, 23, 22, 11, 0, 0, 0, 1, 20, 0, 0, 5, 0, 0, 0, 24, 0, 0, 20, 0, 0, 0, 0, 0, 0, 17, 0, 0, 12, 0, 0, 18, 0, 0, 0, 0, 0, 17, 2, 7, 0, 0, 0, 0, 0, 5, 16, 0, 0, 0, 0, 16, 0, 0, 8, 0, 0, 1, 25, 14, 1, 24, 19, 0, 0, 0, 0, 0, 24, 7, 0, 0, 0, 0, 21, 0, 0, 0, 0, 17, 0, 0, 0, 0, 8, 0, 0, 15, 0, 0, 9, 0, 0, 8, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 13, 20, 0, 26, 0, 0, 0, 2, 0, 28, 0, 0, 0, 0, 0, 11, 0, 27, 0, 0, 10, 19, 0, 0, 0, 0, 13, 25, 30, 28, 28, 0, 21, 0, 0, 0, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 22, 0, 1, 0, 0, 0, 0, 0, 9, 0, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 14, 29, 0, 4, 0, 12, 0, 0, 0, 0, 25, 0, 0, 29, 0, 21, 8, 0, 0, 0, 0, 0, 0, 0, 0, 28, 7, 5, 0, 0, 6, 0, 24, 11, 0, 11, 20, 6, 30, 21, 0, 8, 0, 0, 28, 28, 4, 0, 17, 0, 6, 22, 0, 27, 0, 0, 0, 0, 29, 26, 0, 6, 0, 8, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 0, 20, 0, 0, 0, 5, 21, 2, 0, 0, 0, 28, 0, 0, 20, 0, 0, 7, 0, 0, 25, 0, 0 )));
		Assert.assertEquals(0, canJump);
	}

}
