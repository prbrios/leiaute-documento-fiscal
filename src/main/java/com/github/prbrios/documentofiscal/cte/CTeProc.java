package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Data
@Root(name = "cteProc")
@Namespace(prefix = "xmlns", reference = "http://www.portalfiscal.inf.br/cte")
public class CTeProc {

	@Attribute(name = "versao")
	private String  versao;

	@Element(name = "CTe", required = false)
	private CTe CTe;

	@Element(name = "protCTe", required = false)
	private ProtCTe protCTe;

}
