package mx.edu.uacm.progweb.evaluacionanonima.dominio;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import  javax.persistence.ManyToOne;
import lombok.Data;

/**
 * 
 * @author Andres Mendoza
 *
 */
@Entity
@Data
public class Respuesta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String github;
  private String drive;
  //private float puntaje;
  
  @ManyToOne
  @JoinColumn (name  =  "actividad_id ", foreignKey = @ForeignKey(name = "actividad_ID_FK"))
  private Actividad actividad;
  
  public Respuesta() {

  }
}
