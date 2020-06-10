/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipam.controller;

import com.dipam.entity.Help;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juan
 */
@Stateless
public class HelpFacade extends AbstractFacade<Help> {

    @PersistenceContext(unitName = "DIPAMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HelpFacade() {
        super(Help.class);
    }
    
}
