package br.com.minharepublica.mycrypto.myutil;

import org.junit.Assert;
import org.junit.Test;

public class MyStringGeneratorTest {

	@Test
	public void testBase64WithSize37( ) {
		String s = MyStringGenerator.generateBase64( 37 );

		Assert.assertEquals( 40, s.length( ) );
	}

	@Test
	public void testBase64WithSize40( ) {
		String s = MyStringGenerator.generateBase64( 40 );

		Assert.assertEquals( 40, s.length( ) );
	}

	@Test
	public void testBase64WithSizeFour( ) {
		String s = MyStringGenerator.generateBase64( 4 );

		Assert.assertEquals( 4, s.length( ) );
	}

	@Test
	public void testBase64WithSizeLessThanZero( ) {
		String s = MyStringGenerator.generateBase64( -1 );

		Assert.assertEquals( 4, s.length( ) );
	}

	@Test
	public void testBase64WithSizeOne( ) {
		String s = MyStringGenerator.generateBase64( 1 );

		Assert.assertEquals( 4, s.length( ) );
	}

	@Test
	public void testBase64WithSizeThree( ) {
		String s = MyStringGenerator.generateBase64( 3 );

		Assert.assertEquals( 4, s.length( ) );
	}

	@Test
	public void testBase64WithSizeTwo( ) {
		String s = MyStringGenerator.generateBase64( 2 );

		Assert.assertEquals( 4, s.length( ) );
	}

	@Test
	public void testBase64WithSizeZero( ) {
		String s = MyStringGenerator.generateBase64( 0 );

		Assert.assertEquals( 4, s.length( ) );
	}

	@Test
	public void testHexWithSize37( ) {
		String s = MyStringGenerator.generateHex( 37 );

		Assert.assertEquals( 38, s.length( ) );
	}

	@Test
	public void testHexWithSizeFour( ) {
		String s = MyStringGenerator.generateHex( 4 );

		Assert.assertEquals( 4, s.length( ) );
	}

	@Test
	public void testHexWithSizeLessThanZero( ) {
		String s = MyStringGenerator.generateHex( -1 );

		Assert.assertEquals( 2, s.length( ) );
	}

	@Test
	public void testHexWithSizeOne( ) {
		String s = MyStringGenerator.generateHex( 1 );

		Assert.assertEquals( 2, s.length( ) );
	}

	@Test
	public void testHexWithSizeThree( ) {
		String s = MyStringGenerator.generateHex( 3 );

		Assert.assertEquals( 4, s.length( ) );
	}

	@Test
	public void testHexWithSizeTwo( ) {
		String s = MyStringGenerator.generateHex( 2 );

		Assert.assertEquals( 2, s.length( ) );
	}

	@Test
	public void testHexWithSizeZero( ) {
		String s = MyStringGenerator.generateHex( 0 );

		Assert.assertEquals( 2, s.length( ) );
	}

}
