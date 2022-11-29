package com.github.prbrios.documentofiscal.nfse.ginfes.v2;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import com.github.prbrios.documentofiscal.nfse.ginfes.v2.tipos.IdentificacaoPrestador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@NamespaceList({
	@Namespace(prefix = "ds", reference = "http://www.w3.org/2000/09/xmldsig#"),
	@Namespace(prefix = "n1", reference = "http://www.altova.com/samplexml/other-namespace"),
	@Namespace(prefix = "tipos", reference = "http://www.ginfes.com.br/tipos"),
	@Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance"),
	@Namespace(reference = "http://www.ginfes.com.br/servico_cancelar_nfse_envio")
})
@Root(name = "CancelarNfseEnvio")
public class CancelarNfseEnvio {

	@Namespace(reference = "http://www.ginfes.com.br/servico_cancelar_nfse_envio")
	@Element(name = "Prestador", required = false)
	protected IdentificacaoPrestador prestador;

	@Element(name = "NumeroNfse", required = false)
	protected String numeroNfse;

	@Element(name = "Signature", required = false)
	protected Signature signature;
	
	public IdentificacaoPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(IdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}

	public String getNumeroNfse() {
		return numeroNfse;
	}

	public void setNumeroNfse(String numeroNfse) {
		this.numeroNfse = numeroNfse;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}


