package com.crud.demofinal.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demofinal.models.KhachHang;

@Repository
public interface KhachHangRepository extends CrudRepository<KhachHang, Integer>{}
