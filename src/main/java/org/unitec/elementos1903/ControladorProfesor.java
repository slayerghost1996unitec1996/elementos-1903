/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Servicios Especiales
 */
@RestController
@RequestMapping("/api")
public class ControladorProfesor {
 ///metodo para guardar
    @Autowired
    RepoProfesor repoProfe;
    
    //guardar
    @PostMapping ("/profesor")
    public Estatus guardar(@RequestBody String json) throws Exception{
    //primero vamos a recibir el jsondel cliente web y lo transformamos
    //a un objeto java con la clase objeto
ObjectMapper maper=new ObjectMapper();
    
//ahora si lo leemos

Profesor profe=  maper.readValue(json, Profesor.class);
     
repoProfe.save(profe);

//generamos el estatus

Estatus e=new Estatus();
e.setMensaje(" profe guardado con exito");
e.setSuccess(true);

return e;


    }
    
    @GetMapping("/profesor")
    public List<Profesor> buscarTodos(){
        return repoProfe.findAll();
    }
    
    //borrar
      @DeleteMapping("/profesor/{id}") 
      public Estatus borrar(@PathVariable Integer id){
          repoProfe.deleteById(id);
          Estatus e=new Estatus();
          e.setSuccess(true);
          e.setMensaje("profesor borradon con exito");
          return e;
          
          
      }
      
      //actualizar
      
      @PutMapping("/profesor")
      public Estatus actualizar(@RequestBody  String json)throws Exception{
          
           //primero vamos a recibir el jsondel cliente web y lo transformamos
    //a un objeto java con la clase objeto
ObjectMapper maper=new ObjectMapper();
    
//ahora si lo leemos

Profesor profe=  maper.readValue(json, Profesor.class);
     
repoProfe.save(profe);

//generamos el estatus

Estatus e=new Estatus();
e.setMensaje(" profe guardado con exito");
e.setSuccess(true);

return e;


      }
      
      //buscar por id
      
      @GetMapping("/profesor/{id}")
      public Profesor buscarPorId(@PathVariable Integer id){
      
          return repoProfe.findById(id).get();
          
      
}

}