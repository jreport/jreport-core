package br.jreport.core.api.datasource;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface Datasource<T> extends Serializable {

	List<T> getList();

	Optional<String> emptyMessage();
}
