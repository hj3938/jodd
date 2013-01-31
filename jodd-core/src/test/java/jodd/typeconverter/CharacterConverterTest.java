// Copyright (c) 2003-2013, Jodd Team (jodd.org). All Rights Reserved.

package jodd.typeconverter;

import jodd.typeconverter.impl.CharacterConverter;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterConverterTest {

	@Test
	public void testConversion() {
		CharacterConverter characterConverter = new CharacterConverter();

		assertNull(characterConverter.convert(null));

		assertEquals(Character.valueOf((char) 1), characterConverter.convert(Character.valueOf((char) 1)));
		assertEquals(Character.valueOf((char) 1), characterConverter.convert(Integer.valueOf(1)));
		assertEquals(Character.valueOf((char) 1), characterConverter.convert(Short.valueOf((short) 1)));
		assertEquals(Character.valueOf((char) 1), characterConverter.convert(Double.valueOf(1.0D)));
		assertEquals(new Character('1'), characterConverter.convert("1"));

		try {
			characterConverter.convert("aa");
			fail();
		} catch (TypeConversionException ignore) {
		}
	}
}

