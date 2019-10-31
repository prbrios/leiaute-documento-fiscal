package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "cobr")
public class NFeInfNFeCobr {

    @Element(name = "fat", required = false)
    private NFeInfNFeCobrFat fat;

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
