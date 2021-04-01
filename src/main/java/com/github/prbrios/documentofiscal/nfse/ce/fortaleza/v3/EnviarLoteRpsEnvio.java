package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.assinatura.Signature;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@JsonRootName("enviarloterpsenvio")
@Root(name = "EnviarLoteRpsEnvio")
@Namespace(reference = "http://www.ginfes.com.br/servico_enviar_lote_rps_envio_v03.xsd")
public class EnviarLoteRpsEnvio {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("loterps")
	@Element(name = "LoteRps", required = false)
	protected LoteRps loteRps;

	@Element(name = "Signature", required = false)
	protected Signature signature;

	public LoteRps getLoteRps() {
		return loteRps;
	}

	public void setLoteRps(LoteRps loteRps) {
		this.loteRps = loteRps;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
