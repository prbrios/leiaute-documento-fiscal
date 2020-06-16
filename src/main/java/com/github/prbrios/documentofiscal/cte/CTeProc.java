package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "cteProc")
@Namespace(prefix = "xmlns", reference = "http://www.portalfiscal.inf.br/cte")
public class CTeProc {

	@Attribute(name = "versao")
	private String  versao;

	@Element(name = "CTe", required = false)
	private CTe CTe;

	@Element(name = "protCTe", required = false)
	private ProtCTe protCTe;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public CTe getCTe() {
		return CTe;
	}

	public void setCTe(CTe cTe) {
		CTe = cTe;
	}

	public ProtCTe getProtCTe() {
		return protCTe;
	}

	public void setProtCTe(ProtCTe protCTe) {
		this.protCTe = protCTe;
	}

}
