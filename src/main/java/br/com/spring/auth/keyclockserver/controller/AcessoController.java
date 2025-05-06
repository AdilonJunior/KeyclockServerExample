package br.com.spring.auth.keyclockserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcessoController {

    @GetMapping("/acessoAdmin")
    public String helloAdmin()
    {
        return "Ola Admin, bem vindo. Seus acessos de administrador";
    }

    @GetMapping("/acessoUser")
    public String helloUser()
    {
        return "Ola User, bem vindo. Seus acessos de usuário";
    }
}
