package br.com.minharepublica.mycrypto.myhash.unkeyed;

import java.security.NoSuchAlgorithmException;

import br.com.minharepublica.mycrypto.myhash.MyHash;

public final class MySHA256 extends MyHash {

	public MySHA256( ) throws NoSuchAlgorithmException {
		super( "SHA-256" );
	}

}
