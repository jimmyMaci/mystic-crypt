/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.crypto.aes;

import de.alpharogroup.crypto.chainable.ChainableStringEncryptor;
import de.alpharogroup.crypto.core.ChainableEncryptor;
import de.alpharogroup.crypto.interfaces.Encryptor;

/**
 * The class {@link ChainedStringEncryptor} can take many {@code Encryptor} objects and encrypts the
 * given string with all the given {@code Encryptor} objects. For an example see the unit test.
 *
 * @deprecated use instead the new class {@link ChainableStringEncryptor}. This class will be
 *             removed in the next major release.
 */
@Deprecated
public class ChainedStringEncryptor extends ChainableEncryptor<String>
{

	/**
	 * Instantiates a new {@link ChainedStringEncryptor} object.
	 *
	 * @param encryptors
	 *            the encryptors
	 */
	@SafeVarargs
	public ChainedStringEncryptor(final Encryptor<String, String>... encryptors)
	{
		super(encryptors);
	}

}