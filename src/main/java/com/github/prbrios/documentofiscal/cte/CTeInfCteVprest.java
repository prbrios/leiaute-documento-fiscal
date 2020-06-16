package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "vPrest")
public class CTeInfCteVprest {

	@Element(name = "vTPrest", required = false)
	private String vTPrest;

	@Element(name = "vRec", required = false)
	private String vRec;

	@ElementList(name = "Comp", required = false, inline = true)
	private List<CTeInfCteVprestComp> Comp = new ArrayList<CTeInfCteVprestComp>();

	public String getvTPrest() {
		return vTPrest;
	}

	public void setvTPrest(String vTPrest) {
		this.vTPrest = vTPrest;
	}

	public String getvRec() {
		return vRec;
	}

	public void setvRec(String vRec) {
		this.vRec = vRec;
	}

	public List<CTeInfCteVprestComp> getComp() {
		return Comp;
	}

	public void setComp(List<CTeInfCteVprestComp> comp) {
		Comp = comp;
	}

}
