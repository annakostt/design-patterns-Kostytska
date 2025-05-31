import java.util.*

class CarSimulator {
    private val car: Car = Car()
    private val carBuilder: CarBuilder

    init {
        val engine = car.engine
        val wheels = car.wheels

        carBuilder = CarBuilder(wheels, engine, car)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val carSimulator = CarSimulator()

            println(carSimulator.car.car)
            println(carSimulator.carBuilder.carBuild)
        }
    }
}