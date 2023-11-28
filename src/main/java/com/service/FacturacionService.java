package com.service;

import com.repository.FacturacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturacionService {

    @Autowired
    private FacturacionRepository facturacionRepository;
}
