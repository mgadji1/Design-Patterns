package states.implementations

import trafficLight.TrafficLight
import states.interfaces.TrafficLightState

class YellowLightState(private val trafficLight : TrafficLight) : TrafficLightState {
    override fun redLight() {
        println("Cannot switch to red light")
    }

    override fun yellowLight() {
        println("Yellow light! Ready?")
        trafficLight.setState(trafficLight.greenLightState)
    }

    override fun greenLight() {
        println("Wait for yellow light first")
    }
}