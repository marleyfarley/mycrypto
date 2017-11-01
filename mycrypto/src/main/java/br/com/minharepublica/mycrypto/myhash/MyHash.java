package br.com.minharepublica.mycrypto.myhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class MyHash implements IMyHash {

	private static final String	MSG_EMPTY_ALGORITHM	= "Algorithm must not be empty.";

	private static final String	MSG_NULL_ALGORITHM	= "Algorithm must not be null.";

	protected final String		algorithmName;

	private final MessageDigest	md;

	public MyHash( String theAlgorithm ) throws NoSuchAlgorithmException {
		if ( theAlgorithm == null ) { throw new IllegalArgumentException( MyHash.MSG_NULL_ALGORITHM ); }
		if ( theAlgorithm.trim( ).isEmpty( ) ) { throw new IllegalArgumentException( MyHash.MSG_EMPTY_ALGORITHM ); }

		algorithmName = theAlgorithm;

		md = MessageDigest.getInstance( algorithmName );
	}

	@Override
	public byte[ ] hash( byte[ ] value, byte[ ] salt ) {

		if ( value == null ) { throw new IllegalArgumentException( IMyHash.MSG_NULL_VALUE ); }

		if ( salt == null ) { throw new IllegalArgumentException( IMyHash.MSG_NULL_SALT ); }

		int v = value.length;
		int s = salt.length;

		byte[ ] msg = new byte[ v + s ];

		System.arraycopy( value, 0, msg, 0, v );
		System.arraycopy( salt, 0, msg, v, s );

		msg = md.digest( msg );

		return msg;
	}

}
