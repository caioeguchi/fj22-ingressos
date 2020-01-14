package br.com.caelum.ingresso.mode.descontos;

import java.math.BigDecimal;

public interface Desconto {
	BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal);

}
