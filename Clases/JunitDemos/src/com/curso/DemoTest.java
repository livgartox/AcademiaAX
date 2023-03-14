package com.curso;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DemoTest {

	@Test
	@DisplayName("Length Basic")
	void length_basic() {
		int actualLength="ABCD".length();
		int expectedLength=4;
		assertEquals(expectedLength,actualLength);
	}
	@Test
	void length_greater_than_zero() {
		assertTrue("ABCD".length()>0);
		assertTrue("ABC".length()>0);
		assertTrue("a".length()>0);
		assertTrue("DEF".length()>0);
		
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"ABCD","ABC","abc","DEF"})
	void length_greater_than_zero_using_parameterized_test(String str) {
		assertTrue(str.length()>2);
	}
	
	
	
	//@ParameterizedTest
	//@CsvSource(value= {"abcd, ABCD","defg, DEFG"})
	//void uppercase(String word, String capitalizedWord) {
		//assertTrue(capitalizedWord,word.toUpperCase());
	//}
	
	@Test
	void testNull() {
		String str="abcd";
		String result=null;
		assertNotNull(str);
		assertNull(result);
	}

}
