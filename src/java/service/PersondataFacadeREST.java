/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dk.cphbusiness.services.Persondata;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author PC
 */
@Stateless
@Path("dk.cphbusiness.services.persondata")
public class PersondataFacadeREST extends AbstractFacade<Persondata> {
    @PersistenceContext(unitName = "WebServiceWannabeKrakPU")
    private EntityManager em;

    public PersondataFacadeREST() {
        super(Persondata.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Persondata entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(Persondata entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("Phone/{nr}")
    @Produces({"application/json"})
    public Persondata find(@PathParam("nr") String nr) {
        return (Persondata)em.createNamedQuery("Persondata.findByPhone").setParameter("phone", nr).getSingleResult();
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Persondata> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Persondata> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
