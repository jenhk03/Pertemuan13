import kotlin.math.pow
import kotlin.math.roundToInt

class Car(val make: String, val color: String)

class Contact(var fullName: String, var email: String)

class Contact2(var fullName: String, var email: String)

class Contact3(var fullName: String, val email: String, var type: String = "Friend")

class Person(val firstName: String, val lastName: String)
{
    val fullName = "$firstName $lastName"
}

class Address
{
    var address1: String
    var address2: String? = null
    var city = ""
    var state: String
    init {
        address1 = ""
        state = ""
    }
}

class TV(var height: Double, var width: Double)
{
    var diagonal: Int
        get()
        {
            val result = Math.sqrt(height.pow(2) + width.pow(2))
            return result.roundToInt()
        }
        set(value)
        {
            val ratioWidth = 16.0
            val ratioHeight = 9.0
            val ratioDiagonal = Math.sqrt(ratioWidth.pow(2) + ratioHeight.pow(2))
            height = value * ratioHeight / ratioDiagonal
            width = height * ratioWidth / ratioHeight
        }
}

class Level(val id: Int, var boss: String, var unlocked: Boolean)
{
    companion object
    {
        var highestLevel = 1
    }
}

fun main()
{
    val contact = Contact("Jendraja Husin Kotan", "jendrajahk0303@gmail.com")
    val name = contact.fullName
    val email = contact.email
    println(name)
    println(email)
    contact.fullName = "Jouretta Husin Kotan"
    println(contact.fullName)
    val jen = contact.fullName
    var contact2 = Contact2("Jendraja Husin Kotan", "jendrajahk0303@gmail.com")
    contact2.email = "jendrajahk03@mhs.mdp.ac.id"
    var contact3 = Contact3("Jendraja Husin Kotan", "jendrajahk0303@gmail.com")
    val person = Person("Jendraja", "Husin Kotan")
    println(person.fullName)
    val address = Address()
    val tv = TV(53.93, 95.87)
    val size = tv.diagonal
    println(size)
    val level1 = Level(1, "Chameleon", true)
    val level2 = Level(2, "Squid", false)
    val level3 = Level(3, "Chupa", false)
    val level4 = Level(4, "Pikachu", false)
}