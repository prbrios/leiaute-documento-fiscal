package com.github.prbrios.documentofiscal.cfe;

import com.github.prbrios.documentofiscal.DFPersister;
import com.github.prbrios.documentofiscal.IDFPersister;
import com.github.prbrios.documentofiscal.cfe.envio.CFe;

import java.io.File;

public class CFePersister implements IDFPersister<CFe> {

    @Override
    public CFe read(File file) {
        return new DFPersister<CFe>(){}.read(file);
    }

    @Override
    public CFe read(String xml) {
        return new DFPersister<CFe>(){}.read(xml);
    }

    @Override
    public String write(CFe obj) {
        return new DFPersister<CFe>(){}.write(obj);
    }

    @Override
    public CFe readFromJSON(String json) {
        return null;
    }

    @Override
    public String writeToJSON(CFe obj) {
        return null;
    }

}
