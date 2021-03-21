package net.damoniy

import java.io.Serializable
import javax.persistence.*

@Entity
class Person constructor(par0: Int?, par1: String, par2: String) : Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = par0
    var name = par1
    var email = par2

    override fun toString(): String {
        return "ID: $id, Name: $name, email: $email"
    }
}