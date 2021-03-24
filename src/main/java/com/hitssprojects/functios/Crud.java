package com.hitssprojects.functios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.hitssprojects.config.conexJPA;
import com.hitssprojects.entity.Ticket;

public class Crud {
	EntityManager entity = conexJPA.getEntityManagerFactory().createEntityManager();

	public void GuardarTicket(Ticket eTicket) {
		entity.getTransaction().begin();
		entity.persist(eTicket);
		entity.getTransaction().commit();
	}

	public List<Ticket> mostrarTodo() {
		List<Ticket> ticket = new ArrayList<Ticket>();
		Query query = entity.createQuery("SELECT C FROM ticket C");
		ticket = query.getResultList();
		return ticket;

	}
}
