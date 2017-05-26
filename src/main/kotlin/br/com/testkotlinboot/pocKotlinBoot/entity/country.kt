package br.com.testkotlinboot.pocKotlinBoot.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

/**
 * Created by hllink on 5/25/17.
 */
@Entity
@SequenceGenerator(name = "country_seq", sequenceName = "country_seq", allocationSize = 1)
class Country() {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    var name: String = ""

    @JsonIgnore
    @OneToMany(mappedBy = "country")
    lateinit var cities: Collection<City>

    constructor(name: String): this() {
        this.name = name
    }
}