package com.example.prueba2.controller;

import com.example.prueba2.model.Cliente;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class ClienteController {

    @GetMapping ("index")
    public String GetIndex(){
        return "Prueba 2";
    }

    @GetMapping("clientes")
    public ResponseEntity<List<Cliente>> GetClientes(){
        Cliente c1 = new Cliente(1,"aa","bb","cc","dd");
        Cliente c2 = new Cliente(2,"ee","ff","gg","hh");
        return new ResponseEntity<>(List.of(c1,c2), HttpStatus.OK);
    }

    @GetMapping("success")
    public ResponseEntity<String> GetSuccess(){
        return new ResponseEntity<>("Operacion existosa",HttpStatus.OK);
    }

    @GetMapping("not-found")
    public ResponseEntity<String> GetNotFound(){
        return new ResponseEntity<>("Recurso no encontrado", HttpStatus.NOT_FOUND);
    }

    @GetMapping("error")
    public ResponseEntity<String> GetError(){
        return new ResponseEntity<>("Error interno",HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
