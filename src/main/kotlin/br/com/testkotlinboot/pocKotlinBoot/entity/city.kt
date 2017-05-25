package br.com.testkotlinboot.pocKotlinBoot.entity

import javax.persistence.*

/**
 * Created by hllink on 5/25/17.
 */
@Entity
@SequenceGenerator(name = "city_seq", sequenceName = "city_seq", allocationSize = 1)
class City() {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

    var name: String = ""

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
    lateinit var country: Country

    constructor(name: String, country: Country?) : this() {
        this.name = name
        if (country != null) this.country = country
    }
    constructor(name: String) : this(name,null) {
    }
}