package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "ConsultarNfseRpsEnvio")
@Namespace(reference = "http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd")
public class ConsultarNfseRpsEnvio {

	@JsonProperty(value = "identificacaorps", required = false)
	@Element(name = "IdentificacaoRps", required = false)
	private TcIdentificacaoRps identificacaoRps;
	
	@JsonProperty(value = "prestador", required = false)
	@Element(name = "Prestador", required = false)
	private TcIdentificacaoPrestador prestador;

	public TcIdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}

	public void setIdentificacaoRps(TcIdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}

	public TcIdentificacaoPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(TcIdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}
	
}
