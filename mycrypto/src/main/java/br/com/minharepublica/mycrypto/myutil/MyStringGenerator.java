package br.com.minharepublica.mycrypto.myutil;

import java.security.SecureRandom;

public class MyStringGenerator {

	@SuppressWarnings( "unused" )
	private static final MyStringGenerator singleton;

	static {
		singleton = new MyStringGenerator( );
	}

	/**
	 * Generate a random String with at least {@code size} characters. The generated
	 * String will always be of a length that is multiple of 4. So, if {@code size}
	 * is not multiple of 4, the length will the next number greater than
	 * {@code size} that is multiple of 4.
	 */
	public static String generateBase64( int size ) {

		if ( size <= 4 ) {
			size = 4;
		} else {
			int m = size % 4;
			if ( m != 0 ) {
				size = size + 4 - m;
			}
		}

		byte[ ] bytes = new byte[ 3 * size / 4 ];
		new SecureRandom( ).nextBytes( bytes );

		return MyConverter.byteToBase64( bytes );
	}

	/**
	 * Generate a random String with at least {@code size} characters. The generated
	 * String will always be of a length that is multiple of 2. So, if {@code size}
	 * is not multiple of 4, the length will the next number greater than
	 * {@code size} that is multiple of 2.
	 */
	public static String generateHex( int size ) {

		if ( size <= 2 ) {
			size = 2;
		} else {
			int m = size % 2;
			if ( m != 0 ) {
				size = size + 2 - m;
			}
		}

		byte[ ] bytes = new byte[ size / 2 ];
		new SecureRandom( ).nextBytes( bytes );

		return MyConverter.byteToHex( bytes );
	}

}
