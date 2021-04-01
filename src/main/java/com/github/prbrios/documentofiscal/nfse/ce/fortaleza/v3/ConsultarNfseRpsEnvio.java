package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v3;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "ConsultarNfseRpsEnvio")
@Namespace(reference = "http://www.ginfes.com.br/servico_consultar_nfse_rps_envio_v03.xsd")
public class ConsultarNfseRpsEnvio {
	
	@Element(name = "IdentificacaoRps", required = false)
	protected IdentificacaoRps identificacaoRps;
	
	@Element(name = "Prestador", required = false)
	protected IdentificacaoPrestador prestador;

	@Element(name = "Signature", required = false)
	protected Signature signature;

	public IdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}

	public void setIdentificacaoRps(IdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}

	public IdentificacaoPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(IdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
}
