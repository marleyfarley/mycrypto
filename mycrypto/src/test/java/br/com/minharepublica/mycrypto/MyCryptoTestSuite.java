package br.com.minharepublica.mycrypto;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.minharepublica.mycrypto.myhash.MyHashTest;
import br.com.minharepublica.mycrypto.myhash.unkeyed.MyMD5Test;
import br.com.minharepublica.mycrypto.myhash.unkeyed.MySHA256Test;
import br.com.minharepublica.mycrypto.myhash.unkeyed.MySHA512Test;
import br.com.minharepublica.mycrypto.myutil.MyConverterTest;
import br.com.minharepublica.mycrypto.myutil.MyStringGeneratorTest;

@RunWith( Suite.class )
@SuiteClasses( { MyConverterTest.class, MyStringGeneratorTest.class, MyHashTest.class, MyMD5Test.class,
		MySHA256Test.class, MySHA512Test.class } )
public class MyCryptoTestSuite {

}
