import model.Itens
import model.Peoples

class AddExemples {

   private val peoplesArrayList = arrayListOf<Peoples>()


    fun addPeoples(name: String){
        peoplesArrayList.add(Peoples(name))
    }

    fun getPeople()= peoplesArrayList

}