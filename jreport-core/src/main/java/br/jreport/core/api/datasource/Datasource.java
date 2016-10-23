package br.jreport.core.api.datasource;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Fonte de dados do relatório.
 * 
 * @author jcruz
 *
 * @param <T>
 */
public interface Datasource<T> extends Serializable {

	List<T> getList();

	Optional<String> emptyMessage();
}
