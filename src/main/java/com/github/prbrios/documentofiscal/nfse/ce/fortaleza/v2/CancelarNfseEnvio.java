package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v2;

import java.io.StringWriter;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "tns:CancelarNfseEnvio")
@NamespaceList({
	@Namespace(prefix = "ds", reference = "http://www.w3.org/2000/09/xmldsig#"),
	@Namespace(prefix = "n1", reference = "http://www.altova.com/samplexml/other-namespace"),
	@Namespace(prefix = "tipos", reference = "http://www.ginfes.com.br/tipos"),
	@Namespace(prefix = "tns", reference = "http://www.ginfes.com.br/servico_cancelar_nfse_envio"), // Add your reference here!
	@Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance"),
	//@Namespace(prefix = "xsi:schemaLocation", reference = "http://www.ginfes.com.br/servico_cancelar_nfse_envio_v02.xsd"),
})
public class CancelarNfseEnvio {

	@Element(name = "Prestador")
	@Namespace(prefix = "tns", reference = "")
	protected IdentificacaoPrestador prestador;
	protected String numeroNfse;
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

	public static void main(String[] args)  throws Exception {
		
		IdentificacaoPrestador prestador = new IdentificacaoPrestador();
		prestador.cnpj = "01";
		
		CancelarNfseEnvio obj = new CancelarNfseEnvio();
		obj.setPrestador(prestador);
		
		
		StringWriter writer = new StringWriter();
		Persister persister = new Persister(new Format(4));
		persister.write(obj, writer);
		
		System.out.println(writer.toString());
		
	}
}


