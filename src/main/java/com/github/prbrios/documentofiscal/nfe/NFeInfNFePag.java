package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "pag")
public class NFeInfNFePag {

    @ElementList(name = "detPag", required = false, inline = true)
    private List<NFeInfNFePagDetPag> detPag = new ArrayList<NFeInfNFePagDetPag>();

    @Element(name = "vTroco", required = false)
    private String vTroco;

    public NFeInfNFePag() {}

    /**
     *
     * @param detPag
     * @param vTroco
     */
    public NFeInfNFePag(List<NFeInfNFePagDetPag> detPag, String vTroco) {
        this.detPag = detPag;
        this.vTroco = vTroco;
    }

}
