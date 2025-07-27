package states.implementations

import trafficLight.TrafficLight
import states.interfaces.TrafficLightState

class RedLightState(private val trafficLight : TrafficLight) : TrafficLightState {
    override fun redLight() {
        println("Red light! Stop!")
        trafficLight.setState(trafficLight.yellowLightState)
    }

    override fun yellowLight() {
        println("Wait for red light first")
    }

    override fun greenLight() {
        println("Wait for red and yellow lights first")
    }
}