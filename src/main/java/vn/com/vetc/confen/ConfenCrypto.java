package vn.com.vetc.confen;

public class ConfenCrypto {
	public static String crytoKeyFile;

	public static String DEFAULT_CRYPTOKEY_FILE = "";

	static {
		String pros = System.getProperty("CONFEN_CRYPTO_FILE");

		if (pros == null) {
			
		}
	}

	public static boolean isWindows() {
		return System.getProperty("os.name").startsWith("Windows");
	}
}
