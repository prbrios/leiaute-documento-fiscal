package com.github.prbrios.documentofiscal.mdfe.v300a;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Aereo.class, name = "aereo"),
        @JsonSubTypes.Type(value = Aquav.class, name = "aquav"),
        @JsonSubTypes.Type(value = Rodo.class, name = "rodo"),
        @JsonSubTypes.Type(value = Ferrov.class, name = "ferrov"),
})
public abstract class Modal {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
