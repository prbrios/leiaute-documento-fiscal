package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("cobr")
@Data
@Root(name = "cobr")
public class NFeInfNFeCobr {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fat")
    @Element(name = "fat", required = false)
    private NFeInfNFeCobrFat fat;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dup")
    @ElementList(name = "dup", required = false, inline = true)
    private List<NFeInfNFeCobrDup> dup = new ArrayList<NFeInfNFeCobrDup>();

    public NFeInfNFeCobr() {}

    /**
     *
     * @param fat
     * @param dup
     */
    public NFeInfNFeCobr(NFeInfNFeCobrFat fat, List<NFeInfNFeCobrDup> dup) {
        this.fat = fat;
        this.dup = dup;
    }

}
