package br.jreport.core.api;

import java.io.Serializable;

import br.jreport.core.api.datasource.Datasource;

public interface TableRow extends Serializable {

	int rowIndex();

	boolean isLast();

	boolean isFirst();

	boolean isOdd();

	boolean isEven();

	<T, D extends Datasource<T>> TableRow list(D datasource);
}
