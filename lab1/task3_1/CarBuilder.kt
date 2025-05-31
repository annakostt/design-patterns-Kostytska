import java.util.ArrayList

class CarBuilder(wheels: List<Wheel>, engine: Engine, car: Car) {
    private val carBuild = ArrayList<String>()

    init {
        carBuild.add("Build plan:")
        for (wheel in wheels) {
            carBuild.add(wheel.wheel)
        }
        carBuild.add(engine.engine)
        carBuild.add(car.car)
    }

    fun getCarBuild(): List<String> {
        return carBuild
    }
}