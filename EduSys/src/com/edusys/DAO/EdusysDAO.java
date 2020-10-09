/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import java.util.List;

/**
 *
 * @author DELL
 */
public abstract class EdusysDAO<E,K> {
    abstract public void insert(E entity);
    abstract public void update(E entity,K KeyType);
    abstract public void deleteAt(K keyType1,K keyType2);
    abstract public List<E> selectAll();
    abstract public E selectById(K keyType);
    abstract public List<E> selectBySql(String sql,Object... args);
    abstract public void delete(E entity,K keyType2);
}
