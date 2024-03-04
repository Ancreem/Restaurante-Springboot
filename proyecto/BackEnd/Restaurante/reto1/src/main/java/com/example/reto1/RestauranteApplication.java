package com.example.reto1;

import com.example.reto1.models.Plato;
import com.example.reto1.services.PlatoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;



@SpringBootApplication
public class RestauranteApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(RestauranteApplication.class, args);

//		Creacion de servicios!
		PlatoService platoService = contexto.getBean(PlatoService.class);

// 		Creacion de Objetos
		Plato plato = new Plato();

//		Crear Bicicleta
		plato.setNombre("Rattatuile o como se escriba");
		plato.setDescripcion("Es una comida muy rica, deberian de comerla");
		plato.setPrecio(1000.00);

//-------	CRUD Plato  ---------

//	Guardar plato
		platoService.savePlato(plato);
//
////	Eliminar Plato
//		platoService.deletePlato(1L);
//
////	Actualizar Plato
//		platoService.updatePlato(1L, plato);
//
////	Consultar plato por Id
//		System.out.println(platoService.getPlatoById(1L));
//
////	Consultar todas las Plato
//		List<Plato> platoObj = platoService.getAllPlato();
//		for (Plato platoList : platoObj){
//			System.out.println(platoList);
//		}
	}

}
