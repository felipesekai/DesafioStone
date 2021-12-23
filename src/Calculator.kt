import model.Itens
import model.Peoples

class Calculator {
    //soma recebe dois valores (a e b), e retorna sua soma
    fun sumVtotal(listSum: ArrayList<Itens>): Int {
        var vTotal = 0
        listSum.forEach {
            vTotal += (it.Price * it.Quant)
        }
        return vTotal
    }

    fun divide(itens: ArrayList<Itens>, listPeoples: ArrayList<Peoples>): ArrayList<Peoples> {
        val quantityPeoples = listPeoples.size
        itens.forEach { item ->
            //
            listPeoples.forEach { people ->
                people.divida += ((item.Price*item.Quant)/quantityPeoples)
            }

            if ((item.Price*item.Quant)%quantityPeoples!=0){
                val select = (0 until quantityPeoples).random()
                listPeoples[select].divida+=1
            }

        }
          return listPeoples
    }

    //convertendo os valores
    fun converterOutput(vOut: Double) = vOut/100


}