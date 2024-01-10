package com.crud.demofinal.services;

import com.crud.demofinal.models.KhachHang;
import com.crud.demofinal.repositories.KhachHangRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepositoy;

    public void save(KhachHang kh) {
    	khachHangRepositoy.save(kh);
    }
    
    public Boolean existId(int id) {
    	return khachHangRepositoy.existsById(id);
    }

    public List<KhachHang> getAllCustomers() {
        return (List<KhachHang>) khachHangRepositoy.findAll();
    }

    public KhachHang getCustomerById(int id) {
        return khachHangRepositoy.findById(id).get();
    }

    public void deleteCustomerById(int id) {
    	khachHangRepositoy.deleteById(id);
    }
}
