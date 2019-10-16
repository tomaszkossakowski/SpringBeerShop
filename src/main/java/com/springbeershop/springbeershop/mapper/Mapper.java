package com.springbeershop.springbeershop.mapper;
import org.mapstruct.factory.Mappers;

//Służy do konwersji encji na dto i odwrotnie.
// np BeerDto beerDto(Beer beer);

@org.mapstruct.Mapper
public interface Mapper {
    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

}