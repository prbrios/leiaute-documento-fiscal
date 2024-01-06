package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "ConsultarSituacaoLoteRpsEnvio")
@Namespace(reference = "http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd")
public class ConsultarSituacaoLoteRpsEnvio {

	@JsonProperty(value = "prestador", required = false)
	@Element(name = "Prestador", required = false)
	private TcIdentificacaoPrestador prestador;
	
	@JsonProperty(value = "protocolo", required = false)
	@Element(name = "Protocolo", required = false)
	private String protocolo;

	public TcIdentificacaoPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(TcIdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	
}
