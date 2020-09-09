package com.miempresa.models;

public class Login {
    
    //(Usuario usu) => Creando variable usu de tipo de Usuario (clase creada en el model)
    public Boolean validarCredenciales(Usuario usu){
        //getCorreo => obtiene el correo y debe ser igual a "admin"
        if (usu.getCorreo().equals("admin@gmail.com")&&(usu.getClave().equals("admin"))) {
            return true;
        } else {
            return false;
        }
  
    }
}
