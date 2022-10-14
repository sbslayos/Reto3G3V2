/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repositorio;

import com.example.demo.interfaze.MachineInterfaze;
import com.example.demo.modelo.Machine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class MachineRepositorio {

    @Autowired
    private MachineInterfaze machineCrudRepository;

    public List<Machine> getAll() {
        return (List<Machine>) machineCrudRepository.findAll();
    }

    public Optional<Machine> getMachine(int id) {
        return machineCrudRepository.findById(id);

    }

    public Machine save(Machine machine) {
        return machineCrudRepository.save(machine);

    }

}
