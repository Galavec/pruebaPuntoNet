package com.hitssprojects.service;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.hitssprojects.entity.Ticket;
import com.hitssprojects.functios.Crud;

@ManagedBean(name = "hitssServices")
@RequestScoped
public class HitssServices {
	Crud crud = new Crud();
	Ticket eTicket = new Ticket();

	public String guardar(Ticket peTicket) {
		crud.GuardarTicket(peTicket);
		return "*.xhtml";
	}

	public List<Ticket> mostrarDatos() {
		crud = new Crud();
		return crud.mostrarTodo();
	}

	public String generarTicket() {
		eTicket = new Ticket();
		Map<String, Object> ticketNuevo = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		ticketNuevo.put("ticker", eTicket);
		System.out.println(ticketNuevo);
		return "/newTicket.xhtml";
	}

}
