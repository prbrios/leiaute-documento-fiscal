package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ide")
public class CTeInfCteIde {

	@Element(name = "cUF", required = false)
	private String cUF;

	@Element(name = "cCT", required = false)
	private String cCT;

	@Element(name = "CFOP", required = false)
	private String CFOP;

	@Element(name = "natOp", required = false)
	private String natOp;

	@Element(name = "mod", required = false)
	private String mod;

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "nCT", required = false)
	private String nCT;

	@Element(name = "dhEmi", required = false)
	private String dhEmi;

	@Element(name = "tpImp", required = false)
	private String tpImp;

	@Element(name = "tpEmis", required = false)
	private String tpEmis;

	@Element(name = "cDV", required = false)
	private String cDV;

	@Element(name = "tpAmb", required = false)
	private String tpAmb;

	@Element(name = "tpCTe", required = false)
	private String tpCTe;

	@Element(name = "procEmi", required = false)
	private String procEmi;

	@Element(name = "verProc", required = false)
	private String verProc;

	@Element(name = "indGlobalizado", required = false)
	private String indGlobalizado;

	@Element(name = "cMunEnv", required = false)
	private String cMunEnv;

	@Element(name = "xMunEnv", required = false)
	private String xMunEnv;

	@Element(name = "UFEnv", required = false)
	private String UFEnv;

	@Element(name = "modal", required = false)
	private String modal;

	@Element(name = "tpServ", required = false)
	private String tpServ;

	@Element(name = "cMunIni", required = false)
	private String cMunIni;

	@Element(name = "xMunIni", required = false)
	private String xMunIni;

	@Element(name = "UFIni", required = false)
	private String UFIni;

	@Element(name = "cMunFim", required = false)
	private String cMunFim;

	@Element(name = "xMunFim", required = false)
	private String xMunFim;

	@Element(name = "UFFim", required = false)
	private String UFFim;

	@Element(name = "retira", required = false)
	private String retira;

	@Element(name = "xDetRetira", required = false)
	private String xDetRetira;

	@Element(name = "indIEToma", required = false)
	private String indIEToma;

	@Element(name = "toma3", required = false)
	private CTeInfCteIdeToma3 toma3;

	@Element(name = "toma4", required = false)
	private CTeInfCteIdeToma4 toma4;

	@Element(name = "dhCont", required = false)
	private String dhCont;

	@Element(name = "xJust", required = false)
	private String xJust;

}
