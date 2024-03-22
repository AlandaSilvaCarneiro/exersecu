package alandev.com.br.exer.exersecu.Model.DTOs;

import java.util.Set;

import alandev.com.br.exer.exersecu.Model.Role;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class DtoUser {
      @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 20, unique = true)
    private String email;

    
    private Set<Role> roles;

    @Column(nullable = false, length = 20)
    private String apartment;
    
    @Column(nullable = false, length = 10)
    private String block;

}
