package com.crud.demofinal.services;

import com.crud.demofinal.models.TiemChung;
import com.crud.demofinal.repositories.TiemChungRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiemChungService {

    @Autowired
    private TiemChungRepository tiemChungRepositoy;

    public void save(TiemChung kh) {
    	tiemChungRepositoy.save(kh);
    }

    public List<TiemChung> getAllCustomers() {
        return (List<TiemChung>) tiemChungRepositoy.findAll();
    }

    public TiemChung getCustomerById(int id) {
        return tiemChungRepositoy.findById(id).get();
    }

    public void deleteCustomerById(int id) {
    	tiemChungRepositoy.deleteById(id);
    }
}
