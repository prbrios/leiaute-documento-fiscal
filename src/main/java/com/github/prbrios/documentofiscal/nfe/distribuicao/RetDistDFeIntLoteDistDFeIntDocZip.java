package com.github.prbrios.documentofiscal.nfe.distribuicao;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("doczip")
@Root(name = "docZip")
public class RetDistDFeIntLoteDistDFeIntDocZip {

	@JsonProperty("nsu")
	@Attribute(name = "NSU", required = false)
	private String NSU;
	
	@JsonProperty("schema")
	@Attribute(name = "schema", required = false)
	private String schema;
	
	@Text
	private String text;

	public String getNSU() {
		return NSU;
	}

	public void setNSU(String nSU) {
		NSU = nSU;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
