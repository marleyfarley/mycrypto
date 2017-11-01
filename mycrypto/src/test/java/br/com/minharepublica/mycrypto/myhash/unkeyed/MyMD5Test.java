package br.com.minharepublica.mycrypto.myhash.unkeyed;

import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.junit.Test;

import br.com.minharepublica.mycrypto.myutil.MyConverter;

public class MyMD5Test {

	@Test
	public void testMD5OfEmpyString( ) throws NoSuchAlgorithmException {
		String expectedResult = "d41d8cd98f00b204e9800998ecf8427e";
		byte[ ] bytes = MyConverter.hexToByte( expectedResult );

		byte[ ] hash = new MyMD5( ).hash( "" );
		Assert.assertArrayEquals( bytes, hash );

		String sHash = MyConverter.byteToHex( hash );
		Assert.assertEquals( expectedResult.toUpperCase( ), sHash );
	}

	@Test
	public void testMD5OfExampleString( ) throws NoSuchAlgorithmException {
		String expectedResult = "900150983cd24fb0d6963f7d28e17f72";
		byte[ ] bytes = MyConverter.hexToByte( expectedResult );

		byte[ ] hash = new MyMD5( ).hash( "abc" );
		Assert.assertArrayEquals( bytes, hash );

		String sHash = MyConverter.byteToHex( hash );
		Assert.assertEquals( expectedResult.toUpperCase( ), sHash );
	}

}
