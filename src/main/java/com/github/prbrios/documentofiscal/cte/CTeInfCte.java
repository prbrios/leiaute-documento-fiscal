package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infCte")
public class CTeInfCte {

	@Attribute(name = "versao", required = false)
	private String versao;

	@Attribute(name = "Id", required = false)
	private String id;

	@Element(name = "ide", required = false)
	private CTeInfCteIde ide;

	@Element(name = "compl", required = false)
	private CTeInfCteCompl compl;

	@Element(name = "emit", required = false)
	private CTeInfCteEmit emit;

	@Element(name = "rem", required = false)
	private CTeInfCteRem rem;

	@Element(name = "exped", required = false)
	private CTeInfCteExped exped;

	@Element(name = "receb", required = false)
	private CTeInfCteReceb receb;

	@Element(name = "dest", required = false)
	private CTeInfCteDest dest;

	@Element(name = "vPrest", required = false)
	private CTeInfCteVprest vPrest;

	@Element(name = "imp", required = false)
	private CTeInfCteImp imp;

	@Element(name = "infCTeNorm", required = false)
	private CTeInfCteInfCTeNorm infCTeNorm;

	@Element(name = "infCteComp", required = false)
	private CTeInfCteInfCteComp infCTeComp;

	@Element(name = "infCteAnu", required = false)
	private CTeInfCteInfCteAnu infCTeAnu;

	@ElementList(name = "autXML", required = false, inline = true)
	private List<CTeInfCteAutXML> autXML = new ArrayList<CTeInfCteAutXML>();

	@Element(name = "infRespTec", required = false)
	private CTeInfCteInfRespTec infRespTec;

}
