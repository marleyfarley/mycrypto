package br.com.minharepublica.mycrypto.myutil;

import javax.xml.bind.DatatypeConverter;

public class MyConverter {

	@SuppressWarnings( "unused" )
	private static final MyConverter singleton;

	static {
		singleton = new MyConverter( );
	}

	public static byte[ ] base64ToByte( String s ) {

		return DatatypeConverter.parseBase64Binary( s );
	}

	public static String byteToBase64( byte[ ] s ) {

		return DatatypeConverter.printBase64Binary( s );
	}

	public static String byteToHex( byte[ ] s ) {

		return DatatypeConverter.printHexBinary( s );
	}

	public static byte[ ] hexToByte( String s ) {

		return DatatypeConverter.parseHexBinary( s );
	}

	private MyConverter( ) {
	}

}
