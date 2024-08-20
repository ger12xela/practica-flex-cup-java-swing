package com.ger12xela.cemo_cli_jflex;

import paneles.*;


import java.io.*;

public class Principal {

	Editor e;

	/**
	 * 
	 */
	public Principal() {
		e = new Editor(this);
		e.setVisible(true);

	}

	@SuppressWarnings("deprecation")
	public void parsear() {
		ReporteTokens RT = new ReporteTokens();
		ReportesError RE = new ReportesError();
		FrameFiguras fig = new FrameFiguras();
		e.setRT(RT);
		Reader stringReader = new StringReader(e.getTextEditor().getText());
		IdLexer lexer = new IdLexer(stringReader,RE,RT);
		
		Parser p = new Parser(lexer);
		p.setReporteError(RE);
		p.setPizarra(fig.getPizarra());
		
		try {
			System.out.println(p.parse().value);
			if(!RE.getRL().isEmpty() || !RE.getRS().isEmpty()) {
				e.setSinError(false);
				RE.setVisible(true);
				RE.colocar();
			}else {				
				fig.setVisible(true);
				e.setSinError(true);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
