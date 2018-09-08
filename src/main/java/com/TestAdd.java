package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() 
	{
		Add ad=new Add();
		int a=ad.addition(22, 11);
		assertEquals(33,a);
		
	}

}
