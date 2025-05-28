import kotlin.random.Random

fun main() {
    repeat(10) {
        println("test $it")
        val vehicle = createRandomCar()
        println(vehicle.getType())
        println(vehicle.runTask())
    }
}

fun createRandomCar(): Vehicle {
    val i = Random.nextBoolean()
    return if (i) {
        Car()
    } else {
        Truck()
    }
}