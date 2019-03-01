package br.com.treinar.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.treinar.model.Contact;
import br.com.treinar.model.ContactType;
import br.com.treinar.model.Email;
import br.com.treinar.model.Phone;

@Path("/contacts")
public class ContactsService {

	private static List<Contact> contacts = new ArrayList<Contact>();

	static {
		Contact contact = null;
		for (int i = 0; i < 10; i++) {
			contact = new Contact();
			contact.setEmails(new ArrayList<Email>());
			contact.getEmails().add(new Email(ContactType.PERSONAL, "gleidoson.gmoura".concat(String.valueOf(i)).concat("@gmail.com")));
			contact.getEmails().add(new Email(ContactType.PROFESSIONAL, "ggmoura".concat(String.valueOf(i)).concat("@stefanini.com")));
			contact.setPhones(new ArrayList<Phone>());
			contact.getPhones().add(new Phone(ContactType.PERSONAL, Integer.valueOf(987749130 + i).toString()));
			contact.setId(i);
			contact.setName(i % 2 == 0 ? "Gleidson ".concat(String.valueOf(i)) : "Maria Sophia ".concat(String.valueOf(i)));
			contacts.add(contact);
		}
	}
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> list() {
		return contacts;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{contactId}")
	public Contact getContact(@PathParam("contactId") Integer id) {
		try {
			Contact result = contacts.stream().filter(c -> c.getId() == id).findFirst().get();
			return result;			
		} catch (Exception e) {
			throw new WebApplicationException(404);
		}
	}

	@GET
	@Path("/find/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> findByName(@PathParam("name") String name) {

		List<Contact> result = new ArrayList<Contact>();

		for (Contact contact : contacts) {
			if (contact.getName() != null && contact.getName().toLowerCase().contains(name.toLowerCase())) {
				result.add(contact);
			}
		}

		return result;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Contact add(Contact contact) {
		if (contact.getName() == null || contact.getName().trim().equals("")) {
			throw new WebApplicationException(
					Response.status(Response.Status.BAD_REQUEST).entity("O nome do contato é obrigatório").build());
		}
		contact.setId(contacts.indexOf(contact) + 1);
		contacts.add(contact);
		return contact;
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(@PathParam("id") int id, Contact contact) {
		contacts.set(id - 1, contact);
		contact.setId(contacts.indexOf(contact) + 1);
	}

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		Contact contact = contacts.get(id - 1);
		contacts.remove(contact);
	}

}