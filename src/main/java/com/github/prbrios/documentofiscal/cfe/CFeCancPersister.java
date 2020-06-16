package com.github.prbrios.documentofiscal.cfe;

import java.io.File;

import com.github.prbrios.documentofiscal.DFPersister;
import com.github.prbrios.documentofiscal.IDFPersister;
import com.github.prbrios.documentofiscal.cfe.cancelamento.CFeCanc;

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

    @Override
    public CFeCanc readFromJSON(String json) {
        return null;
    }

    @Override
    public String writeToJSON(CFeCanc obj) {
        return null;
    }

}
