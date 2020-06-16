package com.github.prbrios.documentofiscal.nfe;

import java.io.File;

import com.github.prbrios.documentofiscal.DFPersister;
import com.github.prbrios.documentofiscal.IDFPersister;

public class NFePersister implements IDFPersister<NFe> {

    @Override
    public NFe read(File file) {
        return new DFPersister<NFe>(){}.read(file);
    }

    @Override
    public NFe read(String xml) {
        return new DFPersister<NFe>(){}.read(xml);
    }

    @Override
    public String write(NFe obj) {
        return new DFPersister<NFe>(){}.write(obj);
    }

    @Override
    public NFe readFromJSON(String json) {
        return null;
    }

    @Override
    public String writeToJSON(NFe obj) {
        return null;
    }

}