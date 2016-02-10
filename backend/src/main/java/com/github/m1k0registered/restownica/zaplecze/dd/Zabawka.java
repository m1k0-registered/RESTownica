/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.m1k0registered.restownica.zaplecze.dd;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author m1k0
 */
@Entity
@XmlRootElement
public class Zabawka implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String nazwa;
  @ManyToOne
  private Dziecko dziecko;

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

  public Dziecko getDziecko() {
    return dziecko;
  }

  public void setDziecko(Dziecko dziecko) {
    this.dziecko = dziecko;
  }

  
  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + Objects.hashCode(this.id);
    hash = 83 * hash + Objects.hashCode(this.nazwa);
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
    final Zabawka other = (Zabawka) obj;
    if (!Objects.equals(this.nazwa, other.nazwa)) {
      return false;
    }
    return Objects.equals(this.id, other.id);
  }

  @Override
  public String toString() {
    return "Zabawka{" + "id=" + id + ", nazwa=" + nazwa + '}';
  }

  
}
