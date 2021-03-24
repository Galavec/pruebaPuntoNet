package com.hitssprojects.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_ticket;

	@Column
	private String name_ticket;
	@Column
	private String prioridad;
	@Column
	private String case_owner;
	@Column
	private String details;
	@Column
	private Date due_date;
	@Column
	private String usuario_creacion;
	@Column
	private String usuario_modificacion;
	@Column
	private String status;

	public Ticket(Integer id_ticket, String name_ticket, String prioridad, String case_owner, String details,
			Date due_date, String usuario_creacion, String usuario_modificacion, String status) {
		super();
		this.id_ticket = id_ticket;
		this.name_ticket = name_ticket;
		this.prioridad = prioridad;
		this.case_owner = case_owner;
		this.details = details;
		this.due_date = due_date;
		this.usuario_creacion = usuario_creacion;
		this.usuario_modificacion = usuario_modificacion;
		this.status = status;
	}

	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(Integer id_ticket) {
		this.id_ticket = id_ticket;
	}

	public String getName_ticket() {
		return name_ticket;
	}

	public void setName_ticket(String name_ticket) {
		this.name_ticket = name_ticket;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getCase_owner() {
		return case_owner;
	}

	public void setCase_owner(String case_owner) {
		this.case_owner = case_owner;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public String getUsuario_creacion() {
		return usuario_creacion;
	}

	public void setUsuario_creacion(String usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}

	public String getUsuario_modificacion() {
		return usuario_modificacion;
	}

	public void setUsuario_modificacion(String usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ticket [id_ticket=" + id_ticket + ", name_ticket=" + name_ticket + ", prioridad=" + prioridad
				+ ", case_owner=" + case_owner + ", details=" + details + ", due_date=" + due_date
				+ ", usuario_creacion=" + usuario_creacion + ", usuario_modificacion=" + usuario_modificacion
				+ ", status=" + status + "]";
	}
}