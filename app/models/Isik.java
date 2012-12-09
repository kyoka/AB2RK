package models;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: viru
 * Date: 09.12.12
 * Time: 1:32
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "isik", schema = "raamatukogu")
public class Isik extends GenericModel {

	@Id
	public String isikukood;

	public String eesnimi;

	public String perenimi;

	@Required
	public String telefoni_number;

	@Required
	public String email;

	@Required
	public String kasutajanimi;

	@Required
	public String parool;


}
