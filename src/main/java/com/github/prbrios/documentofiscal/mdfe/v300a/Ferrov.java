package com.github.prbrios.documentofiscal.mdfe.v300a;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("")
@Root(name = "")
public class Ferrov {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected Ferrov.Trem trem;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@ElementList(name = "", required = false, inline = true)
	protected List<Ferrov.Vag> vag = new ArrayList<Ferrov.Vag>();
	
	@JsonRootName("")
	@Root(name = "")
	public static class Trem {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String xPref;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String dhTrem;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String xOri;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String xDest;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String qVag;
	}
	
	@JsonRootName("")
	@Root(name = "")
	public static class Vag {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String pesoBC;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String pesoR;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String tpVag;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String serie;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String nVag;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String nSeq;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String TU;
	}
}
