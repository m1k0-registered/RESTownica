package com.github.m1k0registered.restownica.zaplecze.dd;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Piaskownica.class)
public abstract class Piaskownica_ {

	public static volatile CollectionAttribute<Piaskownica, Dziecko> dzieci;
	public static volatile SingularAttribute<Piaskownica, Long> id;
	public static volatile SingularAttribute<Piaskownica, String> nazwa;
	public static volatile CollectionAttribute<Piaskownica, Zabawka> zabawki;

}

