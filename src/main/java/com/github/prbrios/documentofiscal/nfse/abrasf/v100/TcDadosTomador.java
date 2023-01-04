package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcDadosTomador {

	@JsonProperty(value = "identificacaotomador", required = false)
	@Element(name = "IdentificacaoTomador", required = false)
	private TcIdentificacaoTomador identificacaoTomador;
	
	@JsonProperty(value = "razaosocial", required = false)
	@Element(name = "RazaoSocial", required = false)
	private String razaoSocial;
	
	@JsonProperty(value = "endereco", required = false)
	@Element(name = "Endereco", required = false)
	private TcEndereco endereco;
	
	@JsonProperty(value = "contato", required = false)
	@Element(name = "Contato", required = false)
	private TcContato contato;

	public TcIdentificacaoTomador getIdentificacaoTomador() {
		return identificacaoTomador;
	}

	public void setIdentificacaoTomador(TcIdentificacaoTomador identificacaoTomador) {
		this.identificacaoTomador = identificacaoTomador;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public TcEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(TcEndereco endereco) {
		this.endereco = endereco;
	}

	public TcContato getContato() {
		return contato;
	}

	public void setContato(TcContato contato) {
		this.contato = contato;
	}
	
}
