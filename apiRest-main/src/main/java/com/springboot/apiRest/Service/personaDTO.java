package com.springboot.apiRest.Service;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class personaDTO {
    Long id;
    String ubication;
    String position;
    String fullName;
    String image;

    public personaDTO(Long id, String ubication, String position, String fullName, String image) {
        this.id = id;
        this.ubication = ubication;
        this.position = position;
        this.fullName = fullName;
        this.image = image;
    }
    public personaDTO(){}

}
