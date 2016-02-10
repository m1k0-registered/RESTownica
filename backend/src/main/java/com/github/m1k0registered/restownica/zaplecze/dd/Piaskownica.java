/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.m1k0registered.restownica.zaplecze.dd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author m1k0
 */
@Entity
@XmlRootElement
public class Piaskownica implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nazwa;
  @OneToMany
  private Collection<Dziecko> dzieci;
  @OneToMany
  private Collection<Zabawka> zabawki;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  @XmlTransient
  public Collection<Dziecko> getDzieci() {
    return dzieci;
  }

  public void setDzieci(Collection<Dziecko> dzieci) {
    this.dzieci = dzieci;
  }

  @XmlTransient
  public Collection<Zabawka> getZabawki() {
    return zabawki;
  }

  public void setZabawki(Collection<Zabawka> zabawki) {
    this.zabawki = zabawki;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.id);
    hash = 89 * hash + Objects.hashCode(this.nazwa);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Piaskownica other = (Piaskownica) obj;
    if (!Objects.equals(this.nazwa, other.nazwa)) {
      return false;
    }
    if (!Objects.equals(this.id, other.id)) {
      return false;
    }
    return true;
  }

  
}
