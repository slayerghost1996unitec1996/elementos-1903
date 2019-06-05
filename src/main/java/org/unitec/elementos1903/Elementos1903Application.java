package org.unitec.elementos1903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1903Application implements CommandLineRunner {

    @Autowired
    RepoCliente repoCliente;

    public static void main(String[] args) {
        SpringApplication.run(Elementos1903Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //repoCliente.save(new Cliente(1,"slayerghost1","Alex@hotmail.com"));
        //repoCliente.save(new Cliente(2,"topoyin,","slayerghost1@gmail.com"));
        //repoCliente.save(new Cliente(3,"jesus,","jesusatan@gmail.com"));
        //buscar todos
        for (Cliente c : repoCliente.findAll()) {
            System.out.println(c);
        }
        //BUSQUEDA POR EMAIL
        //for (Cliente d : repoCliente.findByEmail("Alex@hotmail.com")) {
           // System.out.println(d);
        //}

        //buscar por id
        System.out.println(repoCliente.findById(2));

        //borramos el primero despues lo vuelven a insertar
        //repoCliente.deleteById(2);
    }

}
