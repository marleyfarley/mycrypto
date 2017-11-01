package br.com.minharepublica.mycrypto.myhash;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public interface IMyHash {

	public static final String	MSG_NULL_CHARSET	= "Charset must not be null.";

	public static final String	MSG_NULL_SALT		= "Salt must not be null.";

	public static final String	MSG_NULL_VALUE		= "Value must not be null.";

	public byte[ ] hash( byte[ ] value, byte[ ] salt );

	public default byte[ ] hash( String value ) {
		return hash( value, "" );
	}

	public default byte[ ] hash( String value, String salt ) {
		return hash( value, salt, StandardCharsets.UTF_8 );
	}

	public default byte[ ] hash( String value, String salt, Charset charset ) {
		if ( value == null ) { throw new IllegalArgumentException( IMyHash.MSG_NULL_VALUE ); }

		if ( salt == null ) { throw new IllegalArgumentException( IMyHash.MSG_NULL_SALT ); }

		if ( charset == null ) { throw new IllegalArgumentException( IMyHash.MSG_NULL_CHARSET ); }

		return hash( value.getBytes( charset ), salt.getBytes( charset ) );
	}

}
