package br.jreport.core.api;

import java.io.Serializable;

import br.jreport.core.api.datasource.NewDatasource;

public interface NewTableRow extends Serializable {

	int rowIndex();

	boolean isLast();

	boolean isFirst();

	boolean isOdd();

	boolean isEven();

	<T, D extends NewDatasource<T>> NewTableRow list(D datasource);
}
