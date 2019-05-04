package br.com.eventhorizon.common.dao;

import java.util.Collection;

public interface BaseDao<T> {

  T get(String id);

  Collection<T> get(long limit);

  T create(T obj);

  T update(String id, T obj);

  boolean delete(String id);

}
