package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "aquav")
public class CTeInfCteInfCTeNormInfModalAquav {

	@Element(name = "vPrest", required = false)
	private String vPrest;

	@Element(name = "vAFRMM", required = false)
	private String vAFRMM;

	@Element(name = "xNavio", required = false)
	private String xNavio;

	@ElementList(name = "balsa", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavBalsa> balsa
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavBalsa>();

	@Element(name = "nViag", required = false)
	private String nViag;

	@Element(name = "direc", required = false)
	private String direc;

	@Element(name = "irin", required = false)
	private String irin;

	@ElementList(name = "detCont", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetCont> detCont
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetCont>();
	private String tpNav;
}
