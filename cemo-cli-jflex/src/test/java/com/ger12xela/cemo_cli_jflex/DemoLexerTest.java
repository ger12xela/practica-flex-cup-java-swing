package com.ger12xela.cemo_cli_jflex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class DemoLexerTest {
	

	
	@Test
	public void parserAnalysis() throws Exception {
		String cadena = "2+2*6";
		Reader stringReader = new StringReader(cadena);
		IdLexer L = new IdLexer(stringReader);
		Parser p = new Parser(L);
		Integer a = (Integer) p.parse().value;
		
	}
	
	

}
