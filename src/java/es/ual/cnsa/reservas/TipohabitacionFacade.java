/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ual.cnsa.reservas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author usuario
 */
@Stateless
public class TipohabitacionFacade extends AbstractFacade<Tipohabitacion> {
    @PersistenceContext(unitName = "reservasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipohabitacionFacade() {
        super(Tipohabitacion.class);
    }
    
}
