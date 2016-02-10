package com.github.m1k0registered.restownica.zaplecze.dd;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Dziecko.class)
public abstract class Dziecko_ {

	public static volatile SingularAttribute<Dziecko, String> imie;
	public static volatile SingularAttribute<Dziecko, Long> id;
	public static volatile CollectionAttribute<Dziecko, Zabawka> zabawki;

}

