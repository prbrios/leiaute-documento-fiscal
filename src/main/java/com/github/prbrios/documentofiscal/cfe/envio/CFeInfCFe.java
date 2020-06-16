package com.github.prbrios.documentofiscal.cfe.envio;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * Grupo que contém as informações do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "infCFe")
public class CFeInfCFe {

    /**
     * SAT - Versão do leiaute do CF-e
     */
    @Attribute(name = "versao", required = false)
    private String versao;

    /**
     * AC - Versão do leiaute do arquivo de dados enviado pelo Aplicativo Comercial
     */
    @Attribute(name = "versaoDadosEnt", required = false)
    private String versaoDadosEnt;

    /**
     * SAT - Versão do Software Básico instalado no SAT
     */
    @Attribute(name = "versaoSB", required = false)
    private String versaoSB;

    /**
     * SAT - Informar a chave de acesso do CF-e precedida do literal ‘CFe’, acrescentada a validação do formato
     */
    @Attribute(name = "Id", required = false)
    private String Id;

    /**
     * AC - Grupo das informações de identificação do CF-e
     */
    @Element(name = "ide", required = false)
    private CFeInfCFeIde ide;

    /**
     * AC - Grupo de identificação do emitente do CF-e
     */
    @Element(name = "emit", required = false)
    private CFeInfCFeEmit emit;

    /**
     * AC - Grupo de identificação do Destinatário do CF-e
     */
    @Element(name = "dest", required = false)
    private CFeInfCFeDest dest;

    /**
     * AC - Grupo de identificação do Local de entrega
     */
    @Element(name = "entrega", required = false)
    private CFeInfCFeEntrega entrega;

    /**
     * AC - Grupo do detalhamento de Produtos e Serviços do CF-e
     */
    @ElementList(name = "det", required = false, inline = true)
    private List<CFeInfCFeDet> det = new ArrayList<CFeInfCFeDet>();

    /**
     * AC- Grupo de Valores Totais do CF-e
     */
    @Element(name = "total", required = false)
    private CFeInfCFeTotal total;

    /**
     * AC - Grupo de informações sobre Pagamento do CFe
     */
    @Element(name = "pgto", required = false)
    private CFeInfCFePgto pgto;

    /**
     * AC - Grupo de Informações Adicionais
     */
    @Element(name = "infAdic", required = false)
    private CFeInfCFeInfAdic infAdic;

    /**
     * SAT - Informações complementares de interesse do fisco
     */
    @ElementList(name = "obsFisco", required = false, inline = true)
    private List<CFeInfCFeInfAdicObsFisco> obsFisco = new ArrayList<CFeInfCFeInfAdicObsFisco>();

    public CFeInfCFe() {}

    /**
     *
     * @param versao
     * @param versaoDadosEnt
     * @param versaoSB
     * @param id
     * @param ide
     * @param emit
     * @param dest
     * @param entrega
     * @param det
     * @param total
     * @param pgto
     * @param infAdic
     */
    public CFeInfCFe(String versao, String versaoDadosEnt, String versaoSB, String id, CFeInfCFeIde ide, CFeInfCFeEmit emit, CFeInfCFeDest dest, CFeInfCFeEntrega entrega, List<CFeInfCFeDet> det, CFeInfCFeTotal total, CFeInfCFePgto pgto, CFeInfCFeInfAdic infAdic) {
        this.versao = versao;
        this.versaoDadosEnt = versaoDadosEnt;
        this.versaoSB = versaoSB;
        this.Id = id;
        this.ide = ide;
        this.emit = emit;
        this.dest = dest;
        this.entrega = entrega;
        this.det = det;
        this.total = total;
        this.pgto = pgto;
        this.infAdic = infAdic;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getVersaoDadosEnt() {
		return versaoDadosEnt;
	}

	public void setVersaoDadosEnt(String versaoDadosEnt) {
		this.versaoDadosEnt = versaoDadosEnt;
	}

	public String getVersaoSB() {
		return versaoSB;
	}

	public void setVersaoSB(String versaoSB) {
		this.versaoSB = versaoSB;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public CFeInfCFeIde getIde() {
		return ide;
	}

	public void setIde(CFeInfCFeIde ide) {
		this.ide = ide;
	}

	public CFeInfCFeEmit getEmit() {
		return emit;
	}

	public void setEmit(CFeInfCFeEmit emit) {
		this.emit = emit;
	}

	public CFeInfCFeDest getDest() {
		return dest;
	}

	public void setDest(CFeInfCFeDest dest) {
		this.dest = dest;
	}

	public CFeInfCFeEntrega getEntrega() {
		return entrega;
	}

	public void setEntrega(CFeInfCFeEntrega entrega) {
		this.entrega = entrega;
	}

	public List<CFeInfCFeDet> getDet() {
		return det;
	}

	public void setDet(List<CFeInfCFeDet> det) {
		this.det = det;
	}

	public CFeInfCFeTotal getTotal() {
		return total;
	}

	public void setTotal(CFeInfCFeTotal total) {
		this.total = total;
	}

	public CFeInfCFePgto getPgto() {
		return pgto;
	}

	public void setPgto(CFeInfCFePgto pgto) {
		this.pgto = pgto;
	}

	public CFeInfCFeInfAdic getInfAdic() {
		return infAdic;
	}

	public void setInfAdic(CFeInfCFeInfAdic infAdic) {
		this.infAdic = infAdic;
	}

	public List<CFeInfCFeInfAdicObsFisco> getObsFisco() {
		return obsFisco;
	}

	public void setObsFisco(List<CFeInfCFeInfAdicObsFisco> obsFisco) {
		this.obsFisco = obsFisco;
	}

}
