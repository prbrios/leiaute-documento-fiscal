package com.github.prbrios.documentofiscal.cte;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "protCTe")
public class ProtCTe {

	@Attribute(name = "versao", required = false)
	private String versao;

	@Element(name = "infProt", required = false)
	private ProtCTeInfProt infProt;

	@Element(name = "infFisco", required = false)
	private ProtCTeInfFisco infFisco;

	@Element(name = "Signature", required = false)
	private Signature signature;

}
