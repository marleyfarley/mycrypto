package br.com.minharepublica.mycrypto.myutil;

import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;

public class MyConverterTest {

	@Test
	public void testBase64ToString( ) {
		String base64 = MyConverter.byteToBase64( "Base64 encode test.".getBytes( StandardCharsets.UTF_8 ) );

		Assert.assertEquals( "QmFzZTY0IGVuY29kZSB0ZXN0Lg==", base64 );
	}

	@Test
	public void testHexToString( ) {
		String base64 = MyConverter.byteToHex( "Hex encode test.".getBytes( StandardCharsets.UTF_8 ) );

		Assert.assertEquals( "48657820656E636F646520746573742E", base64 );
	}

	@Test
	public void testStringToBase64( ) {
		String base64 = new String( MyConverter.base64ToByte( "QmFzZTY0IGRlY29kZSB0ZXN0Lg==" ) );

		Assert.assertEquals( "Base64 decode test.", base64 );
	}

	@Test
	public void testStringToHex( ) {
		String base64 = new String( MyConverter.hexToByte( "486578206465636F646520746573742E" ) );

		Assert.assertEquals( "Hex decode test.", base64 );
	}

}
