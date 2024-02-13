import kotlin.reflect.jvm.internal.impl.protobuf.ByteString

class Poezdka
{
    var number=55
    var stop="пунк назначения"
    var days=7
    var timein="время прибытия"
    var timestop="время стоянки"
    var cena=0.0
    var kol=55
    var ch=6.0
    var chh="итог"
fun Input(poezdka: Poezdka) {
    try {
        println("введите номер поезда")
        poezdka.number = readLine()!!.toInt()
        println("введите пунк назначения")
        poezdka.stop = readLine()!!.toString()
        println("введите дни следования")
        poezdka.days = readLine()!!.toInt()
        println("введите время прибытия")
        poezdka.timein = readLine()!!.toString()
        println("введите время стоянки")
        poezdka.timestop = readLine()!!.toString()
        println("введите стоимость билета")
        poezdka.cena= readLine()!!.toDouble()
        println("введите кол-во билетов")
        poezdka.kol= readLine()!!.toInt()
        println("введите сколько часов длиться поездка")
        poezdka.ch= readLine()!!.toDouble()

    }catch(e:Exception) { println("неверный формат ввода")}
}
    fun Output(poezdka: Poezdka)
    {
        println("Если цена вашего билета более 1500, вы получаете 10% скидку, если кол-во ваших билетов больше 2 - вы получаете 50% скидку!")
println("номер поезда ${poezdka.number} , пунк назначения ${poezdka.stop} , дни следования ${poezdka.days}  , время прибытия ${poezdka.timein } ,  время стоянки ${poezdka.timestop} ")
        if(poezdka.kol>2)println("цена вашего билета ${poezdka.bilet1(poezdka)}")
        else   println("цена вашего билета ${poezdka.bilet(poezdka)}")
        println("в зависимости от времени длительности поездки, выходит , что ${poezdka.chas(poezdka)}")
    }


    fun bilet(poezdka: Poezdka):Double{
        if (poezdka.cena>1500)
        {
            poezdka.cena=poezdka.cena-(poezdka.cena*0.1)

        }
        else
        {
            poezdka.cena=poezdka.cena
        }
              return poezdka.cena
    }
    fun bilet1 (poezdka: Poezdka):Double{
        if (poezdka.kol>2)
        {
            poezdka.cena=poezdka.cena/2

        }
        else
        {
            poezdka.cena=poezdka.cena
        }
        return poezdka.cena

    }

    fun chas(poezdka: Poezdka):String {

        when
        {
            (poezdka.ch>6&&poezdka.ch>10)->poezdka.chh="скоро будет обед"
            (poezdka.ch>4&&poezdka.ch<6)->poezdka.chh="скоро будет короткая остановка"
            (poezdka.ch>10&&poezdka.ch>12)->poezdka.chh="скоро будет длительная остановка"

        }
        return poezdka.chh
    }
}