package com.github.prbrios.documentofiscal.cte;

import com.github.prbrios.documentofiscal.DFPersister;
import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "CTe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTe {

	@Element(name = "infCte", required = false)
	private CTeInfCte infCte;

	@ElementList(name = "infCTeSupl", required = false, inline = true)
	private List<CTeInfCTeSupl> infCTeSupl = new ArrayList<CTeInfCTeSupl>();

	@Element(name = "Signature", required = false)
	private Signature signature;

}
