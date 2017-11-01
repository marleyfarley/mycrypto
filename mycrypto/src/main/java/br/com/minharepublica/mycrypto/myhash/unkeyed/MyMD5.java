package br.com.minharepublica.mycrypto.myhash.unkeyed;

import java.security.NoSuchAlgorithmException;

import br.com.minharepublica.mycrypto.myhash.MyHash;

public final class MyMD5 extends MyHash {

	public MyMD5( ) throws NoSuchAlgorithmException {
		super( "MD5" );
	}

}
