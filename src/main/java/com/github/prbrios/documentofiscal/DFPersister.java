package com.github.prbrios.documentofiscal;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import java.io.File;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;

public class DFPersister<T> {

    private final Persister persister;
    private Class<T> theType;

    public DFPersister() {

        final ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        this.theType = (Class<T>) (type).getActualTypeArguments()[0];

        this.persister = new Persister(new Format(0));
    }

    public T read (final File xml) {
        try {
            return this.persister.read(this.theType, xml);
        }catch (final Exception e){
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public T read (final String xml) {
        try {
            return this.persister.read(this.theType, xml);
        }catch (final Exception e){
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public String write (T obj) {
        try (StringWriter writer = new StringWriter()) {
            this.persister.write(obj, writer);
            return writer.toString();
        }catch (final Exception e){
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

}
