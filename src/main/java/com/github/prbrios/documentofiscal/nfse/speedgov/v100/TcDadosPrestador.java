package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcDadosPrestador {

	@Element(name = "IdentificacaoPrestador", required = false)
	private TcIdentificacaoPrestador identificacaoPrestador;
	
	@JsonProperty(value = "razaosocial", required = false)
	@Element(name = "RazaoSocial", required = false)
	private String razaoSocial;
	
	@JsonProperty(value = "nomefantasia", required = false)
	@Element(name = "NomeFantasia", required = false)
	private String nomeFantasia;
	
	@JsonProperty(value = "endereco", required = false)
	@Element(name = "Endereco", required = false)
	private TcEndereco endereco;
	
	@JsonProperty(value = "contato", required = false)
	@Element(name = "Contato", required = false)
	private TcContato contato;

	public TcIdentificacaoPrestador getIdentificacaoPrestador() {
		return identificacaoPrestador;
	}

	public void setIdentificacaoPrestador(TcIdentificacaoPrestador identificacaoPrestador) {
		this.identificacaoPrestador = identificacaoPrestador;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
