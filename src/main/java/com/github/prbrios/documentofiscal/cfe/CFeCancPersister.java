package com.github.prbrios.documentofiscal.cfe;

import com.github.prbrios.documentofiscal.DFPersister;
import com.github.prbrios.documentofiscal.IDFPersister;
import com.github.prbrios.documentofiscal.cfe.cancelamento.CFeCanc;
import com.github.prbrios.documentofiscal.cfe.envio.CFe;

import java.io.File;

public class CFeCancPersister implements IDFPersister<CFeCanc> {

    @Override
    public CFeCanc read(File file) {
        return new DFPersister<CFeCanc>(){}.read(file);
    }

    @Override
    public CFeCanc read(String xml) {
        return new DFPersister<CFeCanc>(){}.read(xml);
    }

    @Override
    public String write(CFeCanc obj) {
        return new DFPersister<CFeCanc>(){}.write(obj);
    }

}
