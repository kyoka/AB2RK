package controllers;

import models.Amet;
import models.Autor;
import models.Isbn;
import models.Isik;
import models.Kirjastus;
import models.Laenutaja;
import models.Teavik;
import models.TeavikuTyyp;
import play.db.jpa.JPA;
import play.mvc.*;

import javax.persistence.EntityManager;
import java.util.List;


public class Application extends Controller {

	public static void index() {
//		System.out.println(Autor.count());
//		System.out.println(Amet.count());
//		System.out.println(Isbn.count());
//		System.out.println(Kirjastus.count());
//		System.out.println(Teavik.count());
//		System.out.println(TeavikuTyyp.count());
//		System.out.println(Isik.count());
		List<Teavik> teaviks = Teavik.findAll();
		System.out.println(teaviks);

		System.out.println(Laenutaja.count());
		render();
	}

}