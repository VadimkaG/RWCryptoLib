package ru.vadimka.nfswlauncher;

public class RWEncoderException extends Exception {

	private static final long serialVersionUID = 1193580086273078207L;
	
	private int CODE_ID;
	
	public RWEncoderException(Exception exception, int codeId) {
		super(exception);
		CODE_ID = codeId;
	}
	/**
	 * Получить ID ошибки
	 * 1 - FileNotFoundException
	 * 2 - IOException
	 * 3 - NoSuchAlgorithmException
	 * 4 - NoSuchPaddingException
	 * 5 - InvalidKeyException
	 * 6 - IllegalBlockSizeException
	 * 7 - BadPaddingException
	 */
	public int getCodeId() {
		return CODE_ID;
	}

}
