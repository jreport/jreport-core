package br.jreport.core.api;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

public interface ReportOutputData extends Serializable {

	ByteArrayOutputStream getOutputStream();

	String getMimeType();
}
