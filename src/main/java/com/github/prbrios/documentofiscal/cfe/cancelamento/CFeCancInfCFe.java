package com.github.prbrios.documentofiscal.cfe.cancelamento;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo das informações do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "infCFe")
public class CFeCancInfCFe {

    /**
     * SAT - Versão do leiaute do CF-e cancelamento
     */
    @Attribute(name = "versao", required = false)
    private String versao;

    /**
     * SAT - Identificador da TAG a ser assinada
     */
    @Attribute(name = "Id", required = false)
    private String Id;

    /**
     * AC - Chave de acesso do CF-e a ser cancelado
     */
    @Attribute(name = "chCanc", required = false)
    private String chCanc;

    /**
     * SAT - Data de emissão do CF-e a ser cancelado
     */
    @Element(name = "dEmi", required = false)
    private String dEmi;

    /**
     * SAT - Hora de emissão do CF-e a ser cancelado
     */
    @Element(name = "hEmi", required = false)
    private String hEmi;

    /**
     * AC - Grupo das informações de identificação do CF-e
     */
    @Element(name = "ide", required = false)
    private CFeCancInfCFeIde ide;

    /**
     * AC - Grupo de identificação do emitente do CF-e
     */
    @Element(name = "emit", required = false)
    private CFeCancInfCFeEmit emit;

    /**
     * AC - Grupo de identificação do Destinatário do CF-e
     */
    @Element(name = "dest", required = false)
    private CFeCancInfCFeDest dest;

    /**
     * AC - Grupo de Valores Totais do CF-e
     */
    @Element(name = "total", required = false)
    private CFeCancInfCFeTotal total;

    /**
     * AC - Grupo de Informações Adicionais
     */
    @Element(name = "infAdic", required = false)
    private CFeCancInfCFeInfAdic infAdic;

    public CFeCancInfCFe() {}

    /**
     *
     * @param versao
     * @param id
     * @param chCanc
     * @param dEmi
     * @param hEmi
     * @param ide
     * @param emit
     * @param dest
     * @param total
     * @param infAdic
     */
    public CFeCancInfCFe(String versao, String id, String chCanc, String dEmi, String hEmi, CFeCancInfCFeIde ide, CFeCancInfCFeEmit emit, CFeCancInfCFeDest dest, CFeCancInfCFeTotal total, CFeCancInfCFeInfAdic infAdic) {
        this.versao = versao;
        this.Id = id;
        this.chCanc = chCanc;
        this.dEmi = dEmi;
        this.hEmi = hEmi;
        this.ide = ide;
        this.emit = emit;
        this.dest = dest;
        this.total = total;
        this.infAdic = infAdic;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getChCanc() {
		return chCanc;
	}

	public void setChCanc(String chCanc) {
		this.chCanc = chCanc;
	}

	public String getdEmi() {
		return dEmi;
	}

	public void setdEmi(String dEmi) {
		this.dEmi = dEmi;
	}

	public String gethEmi() {
		return hEmi;
	}

	public void sethEmi(String hEmi) {
		this.hEmi = hEmi;
	}

	public CFeCancInfCFeIde getIde() {
		return ide;
	}

	public void setIde(CFeCancInfCFeIde ide) {
		this.ide = ide;
	}

	public CFeCancInfCFeEmit getEmit() {
		return emit;
	}

	public void setEmit(CFeCancInfCFeEmit emit) {
		this.emit = emit;
	}

	public CFeCancInfCFeDest getDest() {
		return dest;
	}

	public void setDest(CFeCancInfCFeDest dest) {
		this.dest = dest;
	}

	public CFeCancInfCFeTotal getTotal() {
		return total;
	}

	public void setTotal(CFeCancInfCFeTotal total) {
		this.total = total;
	}

	public CFeCancInfCFeInfAdic getInfAdic() {
		return infAdic;
	}

	public void setInfAdic(CFeCancInfCFeInfAdic infAdic) {
		this.infAdic = infAdic;
	}
    
}
