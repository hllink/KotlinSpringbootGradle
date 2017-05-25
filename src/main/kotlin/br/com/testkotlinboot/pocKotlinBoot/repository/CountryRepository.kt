package br.com.testkotlinboot.pocKotlinBoot.repository

import br.com.testkotlinboot.pocKotlinBoot.entity.Country
import org.springframework.data.repository.CrudRepository


/**
 * Created by hllink on 5/25/17.
 */
interface CountryRepository : CrudRepository<Country, Long> {
    fun findFirstByName(name: String): Country?
}