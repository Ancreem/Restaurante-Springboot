package com.example.restaurante;

import com.example.restaurante.domain.service.PlatoService;
import com.example.restaurante.persistence.entity.Plato;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PlatoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(PlatoApplication.class, args);

//		Creacion de servicios!
		PlatoService platoService = contexto.getBean(PlatoService.class);

// 		Creacion de Objetos
		Plato plato = new Plato();

//		Crear Bicicleta
		plato.setImagen("https://www.recetaslamasia.es/wp-content/uploads/2012/10/foto_plato-equilibrado-scaled.jpg");
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
