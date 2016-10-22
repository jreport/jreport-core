package br.jreport.core.api;

import java.io.OutputStream;
import java.io.Serializable;

public interface ReportOutputStream extends Serializable {

	OutputStream getOutputStream();

	String getMimeType();
}
