package es.excibank;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import es.excibank.service.ExcibankService;

@Path("/get")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExcibankResource {

	@Inject
	ExcibankService service;

	@GET
	public ResponseEntity requestMapping() throws Exception {
		
		return new ResponseEntity<>(service.get(), HttpStatus.OK);
	}

}
