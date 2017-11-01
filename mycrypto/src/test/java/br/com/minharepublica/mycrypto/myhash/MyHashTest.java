package br.com.minharepublica.mycrypto.myhash;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.junit.Test;

import br.com.minharepublica.mycrypto.myhash.unkeyed.MyMD5;
import br.com.minharepublica.mycrypto.myutil.MyConverter;

public class MyHashTest {

	@Test( expected = IllegalArgumentException.class )
	public void errorIfAlgorithmIsEmpty( ) throws Exception {
		new MyHash( " " ) {
		};
	}

	@Test( expected = IllegalArgumentException.class )
	public void errorIfAlgorithmIsNull( ) throws Exception {
		new MyHash( null ) {
		};
	}

	@Test( expected = IllegalArgumentException.class )
	public void errorIfCharsetIsNull( ) throws Exception {
		new MyMD5( ).hash( "", "", null );
	}

	@Test( expected = IllegalArgumentException.class )
	public void errorIfSaltIsNull( ) throws Exception {
		new MyMD5( ).hash( "", null );
	}

	@Test( expected = IllegalArgumentException.class )
	public void errorIfSaltIsNullArray( ) throws Exception {
		byte[ ] v = { };
		byte[ ] s = null;
		new MyMD5( ).hash( v, s );
	}

	@Test( expected = IllegalArgumentException.class )
	public void errorIfValueIsNull( ) throws Exception {
		new MyMD5( ).hash( null );
	}

	@Test( expected = IllegalArgumentException.class )
	public void errorIfValueIsNullArray( ) throws Exception {
		byte[ ] v = null;
		byte[ ] s = { };
		new MyMD5( ).hash( v, s );
	}

	@Test
	public void testMD5WithByte( ) throws NoSuchAlgorithmException {
		String expectedResult = "900150983cd24fb0d6963f7d28e17f72";
		byte[ ] bytes = MyConverter.hexToByte( expectedResult );

		byte[ ] hash = new MyMD5( ).hash( "abc".getBytes( StandardCharsets.UTF_8 ), "".getBytes( ) );
		Assert.assertArrayEquals( bytes, hash );
	}

}
