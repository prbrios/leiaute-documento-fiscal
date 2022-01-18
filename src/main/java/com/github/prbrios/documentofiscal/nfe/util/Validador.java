package com.github.prbrios.documentofiscal.nfe.util;

import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class Validador {
	
	public enum Esquema {
		PL_009i_NT2021_004_v100a
	}

	private static boolean valida(final String xml, Esquema esquema, final String xsd) throws IOException, SAXException, URISyntaxException {
		final URL xsdPath = Validador.class.getClassLoader().getResource(String.format("schema_nfe/%s/%s", esquema.name(), xsd));
		final SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		final Schema schema = schemaFactory.newSchema(new StreamSource(xsdPath.toURI().toString()));
		schema.newValidator().validate(new StreamSource(new StringReader(xml)));
		return true;
	}

	public static boolean validaLote(String xml, Esquema esquema) throws Exception {
		return valida(xml, esquema, "enviNFe_v4.00.xsd");
	}

	public static boolean validaNFe(String xml, Esquema esquema) throws Exception {
		return valida(xml, esquema, "nfe_v4.00.xsd");
	}
}
