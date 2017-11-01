package br.com.minharepublica.mycrypto.myhash.unkeyed;

import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.junit.Test;

import br.com.minharepublica.mycrypto.myutil.MyConverter;

public class MySHA256Test {

	@Test
	public void testSHA256OfEmpyString( ) throws NoSuchAlgorithmException {
		String expectedResult = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
		byte[ ] bytes = MyConverter.hexToByte( expectedResult );

		byte[ ] hash = new MySHA256( ).hash( "" );
		Assert.assertArrayEquals( bytes, hash );

		String sHash = MyConverter.byteToHex( hash );
		Assert.assertEquals( expectedResult.toUpperCase( ), sHash );
	}

	@Test
	public void testSHA256OfExampleString( ) throws NoSuchAlgorithmException {
		String expectedResult = "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad";
		byte[ ] bytes = MyConverter.hexToByte( expectedResult );

		byte[ ] hash = new MySHA256( ).hash( "abc" );
		Assert.assertArrayEquals( bytes, hash );

		String sHash = MyConverter.byteToHex( hash );
		Assert.assertEquals( expectedResult.toUpperCase( ), sHash );
	}

}
