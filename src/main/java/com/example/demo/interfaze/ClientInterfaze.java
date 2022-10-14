/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.interfaze;

import com.example.demo.modelo.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface ClientInterfaze extends CrudRepository<Client, Integer> {
    
}
