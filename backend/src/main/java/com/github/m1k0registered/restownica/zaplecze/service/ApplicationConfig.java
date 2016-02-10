/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.m1k0registered.restownica.zaplecze.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author m1k0
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> resources = new java.util.HashSet<>();
    addRestResourceClasses(resources);
    return resources;
  }

  /**
   * Do not modify addRestResourceClasses() method.
   * It is automatically populated with
   * all resources defined in the project.
   * If required, comment out calling this method in getClasses().
   */
  private void addRestResourceClasses(Set<Class<?>> resources) {
    resources.add(com.github.m1k0registered.restownica.zaplecze.service.DzieckoFacadeREST.class);
    resources.add(com.github.m1k0registered.restownica.zaplecze.service.NewCrossOriginResourceSharingFilter.class);
    resources.add(com.github.m1k0registered.restownica.zaplecze.service.PiaskownicaFacadeREST.class);
    resources.add(com.github.m1k0registered.restownica.zaplecze.service.ZabawkaFacadeREST.class);
  }
  
}
