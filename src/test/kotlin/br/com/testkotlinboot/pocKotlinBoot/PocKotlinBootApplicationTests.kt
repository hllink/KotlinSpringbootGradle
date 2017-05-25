package br.com.testkotlinboot.pocKotlinBoot

import br.com.testkotlinboot.pocKotlinBoot.controller.MainController
import br.com.testkotlinboot.pocKotlinBoot.entity.City
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@RunWith(SpringRunner::class)
@SpringBootTest()
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class PocKotlinBootApplicationTests() {


    @Autowired
    lateinit var controller: MainController

    @Test
    fun T1testGetCities() {
        println("################### List all cities test ###################")
        printCitiesResults(controller.citiesRest(null))
        println("################### End test ###################")
    }

    @Test
    fun T2testGetCitiesQueryBr() {
        println("################### Query 'bR' test ###################")
        printCitiesResults(controller.citiesRest("bR"))
        println("################### End test ###################")
    }

    @Test
    fun T3testGetCitiesAdd() {
        println("################### Add cities test Kakariko Village/Hyrule and Ubá/brasil ###################")
        println(controller.addCityRest("Kakariko Village", "Hyrule"))
        println(controller.addCityRest("Ubá", "brasil"))
        println("################### End test ###################")
    }

    @Test
    fun T4testGetCities2() {
        println("################### List all cities test ###################")
        printCitiesResults(controller.citiesRest(null))
        println("################### End test ###################")
    }


    @Test
    fun T5testGetCitiesQueryTest() {
        println("################### Query 'Hyrule' test ###################")
        printCitiesResults(controller.citiesRest("Hyrule"))
        println("################### End test ###################")
    }

    fun printCitiesResults(list: List<City>?) {
        if (list != null) {
            for (item in list) {
                println("City: ${item.name} ; Country: ${item.country.name}")
            }
        }
    }
}
