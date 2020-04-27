package com.github.prbrios.documentofiscal.nfe.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChaveInutilizacao {

    private String cUf;
    private String aa;
    private String cnpj;
    private String mod;
    private String serie;
    private String nNfi;
    private String nNff;

    public ChaveInutilizacao(String cUF,  String mod, String serie, String nnfi, String nnff) {

        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yy");
        String aamm = format.format(now);

        while (cUF.length()<2) { cUF = "0" + cUF; }
        this.cUf = cUF;
        this.aa = aamm.substring(0, 2);

        while (cnpj.length()<14) { cnpj = "0" + cnpj; }
        this.cnpj = cnpj;

        while (mod.length()<2) { mod = "0" + mod; }
        this.mod = mod;

        while (serie.length()<3) { serie = "0" + serie; }
        this.serie = serie;

        while (nnfi.length()<9) { nnfi = "0" + nnfi; }
        this.nNfi = nnfi;

        while (nnff.length()<9) { nnff = "0" + nnff; }
        this.nNff = nnff;

    }

    private String getChaveSemDV() {
        return cUf + aa + cnpj + mod + serie + nNfi + nNff;
    }

    public String getChave() {
        return getChaveSemDV() + String.valueOf(getMod11(getChaveSemDV()));
    }

    public int getDV(){
        return this.getMod11(this.getChaveSemDV());
    }

    private int getMod11(String chaveSemDigito) {

        int[] aux = new int[chaveSemDigito.length()];
        int variavel = 2;
        int total = 0;
        int dv = 0;
        for (int i = aux.length - 1; i >= 0; i--) {
            aux[i] = Integer.parseInt("" + chaveSemDigito.charAt(i));
            aux[i] = aux[i] * variavel;
            variavel++;
            if (variavel > 9)
                variavel = 2;
            total += aux[i];
        }
        total = total % 11; //Porque o total é modulado por onze após as somas...
        if (total == 0 || total == 1)
            dv = 0;
        else
            dv = 11 - total;

        return dv;
    }

}
