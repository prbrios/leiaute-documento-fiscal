package com.github.prbrios.documentofiscal.nfse.ginfes.v3;

import com.github.prbrios.documentofiscal.nfse.ginfes.v3.tipos.IdentificacaoPrestador;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Namespace(reference = "http://www.ginfes.com.br/servico_consultar_lote_rps_envio_v03.xsd")
@Root(name = "ConsultarLoteRpsEnvio")
public class ConsultarLoteRpsEnvio {

	@Element(name = "Prestador")
	protected IdentificacaoPrestador prestador;

	@Element(name = "Protocolo")
	protected String protocolo;

	@Element(name = "Signature", required = false)
	protected Signature signature;

	public IdentificacaoPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(IdentificacaoPrestador prestador) {
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
