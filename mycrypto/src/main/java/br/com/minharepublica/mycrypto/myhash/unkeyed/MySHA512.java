package br.com.minharepublica.mycrypto.myhash.unkeyed;

import java.security.NoSuchAlgorithmException;

import br.com.minharepublica.mycrypto.myhash.MyHash;

public final class MySHA512 extends MyHash {

	public MySHA512( ) throws NoSuchAlgorithmException {
		super( "SHA-512" );
	}

}
