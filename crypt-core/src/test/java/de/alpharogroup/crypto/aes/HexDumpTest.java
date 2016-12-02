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

import static org.junit.Assert.assertEquals;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.StringUtils;
import org.junit.Test;

/**
 * The Class HexDumpTest.
 */
public class HexDumpTest
{

	/**
	 * Test method for {@link de.alpharogroup.crypto.aes.HexDump#decodeHex(char[])}
	 *
	 * @throws DecoderException
	 *             the decoder exception
	 */
	@Test
	public void testDecodeHex() throws DecoderException
	{
		final String expected = "Secret message";
		final char[] actualCharArray = HexDump.encodeHex(StringUtils.getBytesUtf8(expected));
		final byte[] decoded = HexDump.decodeHex(actualCharArray);
		final String actual = new String(decoded);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link de.alpharogroup.crypto.aes.HexDump#decodeHex(byte[])}
	 *
	 * @throws DecoderException
	 *             the decoder exception
	 */
	@Test
	public void testDecodeHexCharacterArray() throws DecoderException
	{
		final String expected = "Secret message";
		final char[] actualCharArray = HexDump.encodeHex(StringUtils.getBytesUtf8(expected));
		final byte[] decoded = HexDump.decodeHex(actualCharArray);
		final String actual = HexDump.decodeHex(decoded);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link de.alpharogroup.crypto.aes.HexDump#decodeHexToString(char[])}
	 *
	 * @throws DecoderException
	 *             the decoder exception
	 */
	@Test
	public void testDecodeHexToString() throws DecoderException
	{
		final String expected = "Secret message";
		final char[] actualCharArray = HexDump.encodeHex(StringUtils.getBytesUtf8(expected));
		final String actual = HexDump.decodeHexToString(actualCharArray);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link de.alpharogroup.crypto.aes.HexDump#encodeHex(byte[])}
	 */
	@Test
	public void testEncodeHex()
	{
		final String secretMessage = "Secret message";
		final String expected = "536563726574206d657373616765";
		final char[] actualCharArray = HexDump.encodeHex(StringUtils.getBytesUtf8(secretMessage));
		final String actual = new String(actualCharArray);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link de.alpharogroup.crypto.aes.HexDump#encodeHex(byte[], boolean)}
	 */
	@Test
	public void testEncodeHexBoolean()
	{
		final String secretMessage = "Secret message";
		final String expected = "536563726574206d657373616765";
		char[] actualCharArray = HexDump.encodeHex(StringUtils.getBytesUtf8(secretMessage), true);
		String actual = new String(actualCharArray);
		assertEquals(expected, actual);
		actualCharArray = HexDump.encodeHex(StringUtils.getBytesUtf8(secretMessage), false);
		actual = new String(actualCharArray);
		assertEquals(expected.toUpperCase(), actual);
	}

	/**
	 * Test method for {@link de.alpharogroup.crypto.aes.HexDump#encodeHex(String)}
	 */
	@Test
	public void testEncodeString()
	{
		final String secretMessage = "Secret message";
		final String expected = "536563726574206d657373616765";
		final char[] actualCharArray = HexDump.encodeHex(secretMessage);
		final String actual = new String(actualCharArray);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link de.alpharogroup.crypto.aes.HexDump#toHex(int)}
	 */
	@Test
	public void testToHex()
	{
		char actual = HexDump.toHex(5);
		org.junit.Assert.assertTrue(actual == '5');
		actual = HexDump.toHex(10);
		org.junit.Assert.assertTrue(actual == 'A');
	}

}
