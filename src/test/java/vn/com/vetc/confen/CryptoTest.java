package vn.com.vetc.confen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class CryptoTest {
	Crypto crypto;
	
	@Before
	public void init() {
		crypto = new Crypto("aebcdefgh1234567");
	}
	
	@Test
	public void testEncryptDecrypt() {
		String text = "hello";
		String encrypted = crypto.encrypt(text);
		System.out.println(encrypted);
		
		assertNotEquals(text, encrypted);
		
		String decrypt = crypto.decrypt(encrypted);
		assertEquals(text, decrypt);
	}
}
