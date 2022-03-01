package br.com.calculadora.controler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/calculadora")
@Produces(MediaType.TEXT_PLAIN)
public class ExampleResource {

    @GET
    
    @Path("/{n1}/{operacao}/{n2}")
    public String calculadora(@PathParam double n1, @PathParam String operacao, @PathParam double n2) throws Exception {
    	String retorno = null;
    	double resultado = 0.0;
    	
    	List<String> lst = new ArrayList<String>();
    	
   	try {
   		
   		lst.add("Star");
   		lst.add("Wars");
   		
    	switch (operacao) {
		case "+":
			resultado = n1 + n2;
			break;
		case "-":
			resultado = n1 - n2;
			break;
		case "*":
			resultado = n1 * n2;
			break;
		case "@":
			resultado = n1 / n2;
			break;
		case "!":
			resultado = n1 % n2;
			break;
		case "++":
			
			for (int i = 0; i < lst.size(); i++) {
				retorno = lst.get(i);
				System.out.println(retorno);
			}
			
			break;
		case "w":
			int i = 0;
			while (1 < 10) {
				System.out.println("zzz");
			}
			
		default:
			throw new Exception("Não existe essa operação");
		}
    	retorno = "Esse foi o resultado de sua operação " + resultado;
    } catch (Exception e) {
			retorno = e.getMessage();
		} finally {
			System.out.println("Calculadora Executada");
		}
    	
		return retorno;		
    }
}