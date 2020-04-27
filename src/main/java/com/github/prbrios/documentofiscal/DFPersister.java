package com.github.prbrios.documentofiscal;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import java.io.File;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;

public class DFPersister<T> implements IDFPersister<T> {

    private final Persister persister;
    private Class<T> theType;

    public DFPersister() {

        final ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        this.theType = (Class<T>) (type).getActualTypeArguments()[0];

        this.persister = new Persister(new Format(0));
    }

    @Override
    public T read (final File xml) {
        try {
            return this.persister.read(this.theType, xml);
        }catch (final Exception e){
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    @Override
    public T read (final String xml) {
        try {
            return this.persister.read(this.theType, xml);
        }catch (final Exception e){
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    @Override
    public String write (T obj) {
        try (StringWriter writer = new StringWriter()) {
            this.persister.write(obj, writer);
            return writer.toString();
        }catch (final Exception e){
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override
    public T readFromJSON(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, theType);
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    @Override
    public String writeToJSON(T obj) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

}
