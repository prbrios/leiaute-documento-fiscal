package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.prbrios.documentofiscal.assinatura.Signature;

@Namespace(reference = "http://ws.speedgov.com.br/consultar_lote_rps_envio_v1.xsd")
@Root(name = "ConsultarLoteRpsEnvio")
public class ConsultarLoteRpsEnvio {

	@JsonProperty(value = "prestador", required = false)
	@Element(name = "Prestador", required = false)
	private TcIdentificacaoPrestador prestador;
	
	@JsonProperty(value = "protocolo", required = false)
	@Element(name = "Protocolo", required = false)
	private String protocolo;
	
	@Element(name = "Signature", required = false)
	private Signature signature;

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

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	
}
