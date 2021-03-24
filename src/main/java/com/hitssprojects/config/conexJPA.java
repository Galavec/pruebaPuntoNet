package com.hitssprojects.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class conexJPA {
	private static final String PERSISTENCE_UNIT_NAME = "CONEXION";
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}

	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}

}
