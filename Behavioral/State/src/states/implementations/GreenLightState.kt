package states.implementations

import trafficLight.TrafficLight
import states.interfaces.TrafficLightState

class GreenLightState(private val trafficLight : TrafficLight) : TrafficLightState {
    override fun redLight() {
        println("Cannot switch to red light")
    }

    override fun yellowLight() {
        println("Cannot switch to yellow light")
    }

    override fun greenLight() {
        println("Green light! Go!")
        trafficLight.setState(trafficLight.redLightState)
    }
}