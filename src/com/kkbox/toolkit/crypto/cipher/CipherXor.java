package com.kkbox.toolkit.crypto.cipher;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public class CipherXor extends CipherSpi {
	private int opmode;

	@Override
	protected byte[] engineDoFinal(byte[] input, int inputOffset, int inputLen)
			throws IllegalBlockSizeException, BadPaddingException {
		if (Cipher.ENCRYPT_MODE == opmode || Cipher.DECRYPT_MODE == opmode) {
			for (int i = inputOffset; i < inputOffset + input.length; i++) {
				input[inputOffset + i] = (byte) (input[inputOffset + i] ^ 99);
			}
			return input;
		} else {
			throw new IllegalStateException();
		}
	}

	@Override
	protected int engineDoFinal(byte[] input, int inputOffset, int inputLen, byte[] output,
	                            int outputOffset) throws ShortBufferException, IllegalBlockSizeException,
			BadPaddingException {
		return 0;
	}

	@Override
	protected int engineGetBlockSize() {
		return 0;
	}

	@Override
	protected byte[] engineGetIV() {
		return null;
	}

	@Override
	protected int engineGetOutputSize(int inputLen) {
		return 0;
	}

	@Override
	protected AlgorithmParameters engineGetParameters() {
		return null;
	}

	@Override
	protected void engineInit(int opmode, Key key, SecureRandom random) throws InvalidKeyException {
		this.opmode = opmode;
	}

	@Override
	protected void engineInit(int opmode, Key key, AlgorithmParameterSpec params,
	                          SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException {
		this.opmode = opmode;
	}

	@Override
	protected void engineInit(int opmode, Key key, AlgorithmParameters params, SecureRandom random)
			throws InvalidKeyException, InvalidAlgorithmParameterException {
		this.opmode = opmode;
	}

	@Override
	protected void engineSetMode(String mode) throws NoSuchAlgorithmException {
	}

	@Override
	protected void engineSetPadding(String padding) throws NoSuchPaddingException {
	}

	@Override
	protected byte[] engineUpdate(byte[] input, int inputOffset, int inputLen) {
		return null;
	}

	@Override
	protected int engineUpdate(byte[] input, int inputOffset, int inputLen, byte[] output,
	                           int outputOffset) throws ShortBufferException {
		return 0;
	}
}
