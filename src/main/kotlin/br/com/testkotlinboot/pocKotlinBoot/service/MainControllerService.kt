package br.com.testkotlinboot.pocKotlinBoot.service

import br.com.testkotlinboot.pocKotlinBoot.entity.City
import br.com.testkotlinboot.pocKotlinBoot.entity.Country
import br.com.testkotlinboot.pocKotlinBoot.repository.CityRepository
import br.com.testkotlinboot.pocKotlinBoot.repository.CountryRepository
import org.springframework.stereotype.Service

/**
 * Created by hllink on 5/25/17.
 */
@Service
class MainControllerService(val cityRepository: CityRepository, val countryRepository: CountryRepository) {

    fun findAll(): List<City>? {
        return cityRepository.findAll()
    }

    fun findByCountryName(countryName: String): List<City>? {
        return cityRepository.findByCountryName(countryName.toUpperCase())
    }

    fun addCity(city: String, country: String): String {
        val city = city.toUpperCase().trim()
        val country = country.toUpperCase().trim()

        var countryEntity = countryRepository.findFirstByName(country)
        if (countryEntity == null) {
            countryEntity = Country(country)
            countryRepository.save(countryEntity)
        }
        val cityEntity = City(city.toUpperCase(),countryEntity)
        cityRepository.save(cityEntity)
        return "$city in the country $country saved with success!"
    }

}