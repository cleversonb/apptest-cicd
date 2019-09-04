package br.com.apptest.util;

import java.io.Serializable;

import javax.enterprise.inject.Produces; 
import javax.enterprise.inject.spi.InjectionPoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe responsável por definir a forma de instanciação do Logger para o framework SLF4J.
 * Isto possibilita o uso de injeção (@Inject) para instanciação do log. 
 * @author celepar - gic
 * @version 1.0, 27/12/2013
 * @since 1.0
 */
public class SLF4JProducer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Produces
	public Logger producer(InjectionPoint ip){
		return LoggerFactory.getLogger(ip.getMember().getDeclaringClass().getName());
	}
  
}
