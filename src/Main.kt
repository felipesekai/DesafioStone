import model.Itens

fun main() {
    val calc = Calculator()
    val addExemples = AddExemples()

    //insira os nomes aqui
    val peoples = arrayListOf(
        "Eu",
        "maria",
        "joao",
        "jorge",
        "marcos"
    )
    //aqui é necessario colocar o valor da quantidade baseado no numero de pessoas,
    //exemplo: se tem 5 pessoas e elas ficaram 3 dias no hotel sera (3*5)* (diaria do hotel)
    // os precos tbm tem q ser multiplicado por 100 como foi solicitado no desafio
    // exemplo: 55,50 RS tem q ser digitado o valor 5550

    //Insira os itens aqui
    val listItens = arrayListOf(
        Itens("hotel", 15, 33799),
        Itens("almoco", 15, 2590),
        Itens("passeio de barco", 5, 15000),
        Itens("sobremesa", 1, 799),

        )

    peoples.forEach { name ->
        addExemples.addPeoples(name)
    }

    val listPeoplesUpdated = calc.divide(listItens, addExemples.getPeople())
    //ordenando a lista por nome
    listPeoplesUpdated.sortBy { it.name }
    //imprimindo a lista
    listPeoplesUpdated.forEach { people ->
        println("nome: ${people.name}, divida: ${calc.converterOutput(people.divida.toDouble())}")
    }

//    val sumTotal = calc.sumVtotal(listItens).toDouble()/peoples.size
//    val vOut = calc.converterOutput(sumTotal)
//
//        peoples.forEach { name->
//            println("nome: ${name}, divida: $vOut")
//        }


}