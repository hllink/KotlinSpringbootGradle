package br.com.testkotlinboot.pocKotlinBoot.repository

import br.com.testkotlinboot.pocKotlinBoot.entity.City
import org.springframework.data.repository.CrudRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param


/**
 * Created by hllink on 5/25/17.
 */
interface CityRepository : CrudRepository<City, Long> {

    fun findByName(name: String): List<City>

    override fun findAll():List<City>

    @Query("from City c where c.country.name like CONCAT('%',:countryName,'%') ")
    fun findByCountryName(@Param("countryName") countryName: String): List<City>?
}