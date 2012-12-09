//package models;
//
//import play.data.validation.Required;
//import play.db.jpa.GenericModel;
//
//import javax.persistence.*;
//import java.util.Date;
//
///**
// * Created with IntelliJ IDEA.
// * User: viru
// * Date: 09.12.12
// * Time: 2:24
// * To change this template use File | Settings | File Templates.
// */
//@Entity
//@Table(name = "laenutamine", schema = "raamatukogu")
//public class Laenutamine extends GenericModel {
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_laenutamine")
//	@SequenceGenerator(name = "seq_laenutamine", sequenceName = "raamatukogu.seq_laenutamine")
//	public Integer laenutamine_id;
//
//	@Required
//	@OneToOne
//	public TeavikuEksemplar eksemplar;
//
//	@Required
//	@OneToOne
//	public Laenutaja laenutaja;
//
//	@Required
//	@OneToOne
//	public Seisund seisund;
//
//	@Required
//	@Column(name = "alguse_aeg", insertable = false, updatable = false)
//	@Temporal(TemporalType.TIMESTAMP)
//	public Date alguse_aeg;
//
//
//	@Required
//	@Column(name = "planeeritud_lopu_aeg", insertable = false, updatable = false)
//	@Temporal(TemporalType.TIMESTAMP)
//	public Date planeeritud_lopu_aeg;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	public Date tegelik_lopu_aeg;
//
//	public int pikendamiste_arv;
//}
