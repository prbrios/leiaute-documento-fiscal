package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("cofins")
@Data
@Root(name = "COFINS")
public class NFeInfNFeDetImpostoCOFINS {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsaliq")
    @Element(name = "COFINSAliq", required = false)
    private NFeInfNFeDetImpostoCOFINSCOFINSAliq COFINSAliq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsqtde")
    @Element(name = "COFINSQtde", required = false)
    private NFeInfNFeDetImpostoCOFINSCOFINSQtde COFINSQtde;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsnt")
    @Element(name = "COFINSNT", required = false)
    private NFeInfNFeDetImpostoCOFINSCOFINSNT COFINSNT;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsoutr")
    @Element(name = "COFINSOutr", required = false)
    private NFeInfNFeDetImpostoCOFINSCOFINSOutr COFINSOutr;

    public NFeInfNFeDetImpostoCOFINS() {}

    /**
     *
     * @param COFINSAliq
     * @param COFINSQtde
     * @param COFINSNT
     * @param COFINSOutr
     */
    public NFeInfNFeDetImpostoCOFINS(NFeInfNFeDetImpostoCOFINSCOFINSAliq COFINSAliq, NFeInfNFeDetImpostoCOFINSCOFINSQtde COFINSQtde, NFeInfNFeDetImpostoCOFINSCOFINSNT COFINSNT, NFeInfNFeDetImpostoCOFINSCOFINSOutr COFINSOutr) {
        this.COFINSAliq = COFINSAliq;
        this.COFINSQtde = COFINSQtde;
        this.COFINSNT = COFINSNT;
        this.COFINSOutr = COFINSOutr;
    }

}
