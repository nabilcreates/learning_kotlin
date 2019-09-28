import java.util.*

fun randomDay():String{
    var days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    return days[Random().nextInt(days.size)]
}

fun getSubject(day: String):String?{
    var subject: String? = null;
    when(day){
        "Monday" -> subject = "English"
        "Tuesday" -> subject = "Maths"
        "Wednesday" -> subject = "Science"
        "Thursday" -> subject = "DNT"
        "Friday" -> subject =  "History"
        "Saturday" -> subject = "Social Studies"
        "Sunday" -> subject = "Chemistry"
    }

    return subject;
}

fun main(){
    var day = randomDay();
    println("You should do ${getSubject(day)} on ${day}")
}
