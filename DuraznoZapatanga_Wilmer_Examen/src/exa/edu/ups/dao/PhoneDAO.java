/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa.edu.ups.dao;

import java.util.List;

import exa.edu.ups.modelo.*;

/**
 *
 * @author claum
 */
public interface PhoneDAO extends GenericDAO<Phone, Integer>{
    public abstract List<Phone> findByUserId(String cedula);
    public abstract List<Phone> findByNumber(String numero, String cedula);
}
