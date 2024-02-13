class Kiniteatr {

    var name = "название кинофильма";
    var seans = "сеанс";
    var stoimost = 0.0;
    var zal = 3;
    var kol = 0;
    var koll=50;
    var vv=1;
    var vvv="zz"
    fun Input(kiniteatr: Kiniteatr) {
        try {
            println("введите название кинофильма")
            kiniteatr.name = readLine()!!.toString()
            println("введите сеанс")
            kiniteatr.seans = readLine()!!.toString()
            println("введите стоимость билета")
            kiniteatr.stoimost = readLine()!!.toDouble()
            println("введите номер зала")
            kiniteatr.zal = readLine()!!.toInt()
            println("введите количество зрителей")
            kiniteatr.kol = readLine()!!.toInt()
            println("введите кол-во билетов")
            kiniteatr.koll= readLine()!!.toInt()
            println("введите чего бы вы хотели взять с собой на сеанс : \n 1.попкорн \n" +
                    " 2.чипсы\n" +
                    " 3.газировка  ")
            kiniteatr.vv= readLine()!!.toInt()
        } catch(e:Exception) { println("неверный формат ввода")}
    }
        fun Output(kiniteatr: Kiniteatr)
        {   println("Если цена вашего билета более 1000, вы получаете 10% скидку, если кол-во ваших билетов больше 2 - вы получаете 50% скидку!")
            println("название кинофильма ${kiniteatr.name} , сеанс ${kiniteatr.seans}  , номер зала ${kiniteatr.zal} ,  количество зрителей ${kiniteatr.kol}")
            if(kiniteatr.koll>2)println("цена вашего билета ${kiniteatr.bilet1(kiniteatr)}")
            else   println("цена вашего билета ${kiniteatr.bilet(kiniteatr)}")
            println("вы взяли с собой на сеанс ${kiniteatr.eda(kiniteatr)}")
        }
    fun bilet(kiniteatr: Kiniteatr):Double{
        if (kiniteatr.stoimost>1000)
        {
            kiniteatr.stoimost=kiniteatr.stoimost-(kiniteatr.stoimost*0.1)

        }
        else
        {
           kiniteatr.stoimost=kiniteatr.stoimost
        }
        return kiniteatr.stoimost
    }
    fun bilet1 (kiniteatr: Kiniteatr):Double{
        if (kiniteatr.koll>2)
        {
            kiniteatr.stoimost=kiniteatr.stoimost/2

        }
        else
        {
            kiniteatr.stoimost=kiniteatr.stoimost
        }
        return  kiniteatr.stoimost

    }
    fun eda(kiniteatr: Kiniteatr):String {

        when(kiniteatr.vv)
        {
            1->kiniteatr.vvv="попкорн"
            2->kiniteatr.vvv="чипсы"
            3->kiniteatr.vvv="газировка"
        }
        return kiniteatr.vvv
    }

    }


