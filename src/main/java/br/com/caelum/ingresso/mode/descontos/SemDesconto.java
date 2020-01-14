package br.com.caelum.ingresso.mode.descontos;

import java.math.BigDecimal;

public class SemDesconto  implements Desconto {
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal;
		
	}

}
