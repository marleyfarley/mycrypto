package br.com.minharepublica.mycrypto.myhash.unkeyed;

import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.junit.Test;

import br.com.minharepublica.mycrypto.myutil.MyConverter;

public class MySHA512Test {

	@Test
	public void testSHA512OfEmpyString( ) throws NoSuchAlgorithmException {
		String expectedResult = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e";
		byte[ ] bytes = MyConverter.hexToByte( expectedResult );

		byte[ ] hash = new MySHA512( ).hash( "" );
		Assert.assertArrayEquals( bytes, hash );

		String sHash = MyConverter.byteToHex( hash );
		Assert.assertEquals( expectedResult.toUpperCase( ), sHash );
	}

	@Test
	public void testSHA512OfExampleString( ) throws NoSuchAlgorithmException {
		String expectedResult = "ddaf35a193617abacc417349ae20413112e6fa4e89a97ea20a9eeee64b55d39a2192992a274fc1a836ba3c23a3feebbd454d4423643ce80e2a9ac94fa54ca49f";
		byte[ ] bytes = MyConverter.hexToByte( expectedResult );

		byte[ ] hash = new MySHA512( ).hash( "abc" );
		Assert.assertArrayEquals( bytes, hash );

		String sHash = MyConverter.byteToHex( hash );
		Assert.assertEquals( expectedResult.toUpperCase( ), sHash );
	}

}
