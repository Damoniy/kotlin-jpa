package net.damoniy

import javax.persistence.Persistence

fun main(args: Array<String>) {
    val emf = Persistence.createEntityManagerFactory("exemplo-jpa")
    val em = emf.createEntityManager()

    val p = em.find(Person::class.java, 2)

    println(p)

    em.close()
    emf.close()
}

