/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.m1k0registered.restownica.zaplecze.service;

import com.github.m1k0registered.restownica.zaplecze.dd.Piaskownica;
import java.util.ArrayList;
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
import javax.ws.rs.core.MediaType;

/**
 *
 * @author m1k0
 */
@Stateless
@Path("piaskownice")
public class PiaskownicaFacadeREST extends AbstractFacade<Piaskownica> {

  @PersistenceContext(unitName = "restownicaPU")
  private EntityManager em;

  public PiaskownicaFacadeREST() {
    super(Piaskownica.class);
  }

  @POST
  @Override
  @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public void create(Piaskownica entity) {
    super.create(entity);
  }

  @PUT
  @Path("{id}")
  @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public void edit(@PathParam("id") Long id, Piaskownica entity) {
    super.edit(entity);
  }

  @DELETE
  @Path("{id}")
  public void remove(@PathParam("id") Long id) {
    super.remove(super.find(id));
  }

  @GET
  @Path("{id}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public Piaskownica find(@PathParam("id") Long id) {
    return super.find(id);
  }

  @GET
  @Override
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public List<Piaskownica> findAll() {
    return super.findAll();
  }
  
  @GET
  @Produces("application/vnd.piaskownice.v2+json")
  public List<Piaskownica> findAllVersion2() {
    final List<Piaskownica> found = super.findAll();
    List<Piaskownica> przefiltrowane = new ArrayList<>();
    found.stream().map((p) -> {
      em.detach(p);
      p.setNazwa(p.getNazwa().toUpperCase());
      return p;
    }).forEach((p) -> {
      przefiltrowane.add(p);
    });

    return przefiltrowane;
  }

  @GET
  @Path("{from}/{to}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public List<Piaskownica> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
    return super.findRange(new int[]{from, to});
  }

  @GET
  @Path("count")
  @Produces(MediaType.TEXT_PLAIN)
  public String countREST() {
    return String.valueOf(super.count());
  }

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }
  
}
