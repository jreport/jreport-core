package br.jreport.core.api;

import java.io.Serializable;

import br.jreport.core.api.datasource.Datasource;

public interface TableRow extends Serializable {

	<T, D extends Datasource<T>> TableRow list(D datasource);
}
