package com.covid.tracker.repsitory;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.covid.tracker.model.CovidData;


public interface CovidDataRepository extends MongoRepository<CovidData, ObjectId> {

    List<CovidData> findAllByCountry(String country);

    CovidData findFirstByCountry(String country);

    CovidData findFirstByCode(String code);

    List<CovidData> findAllByCode(String code);

}
