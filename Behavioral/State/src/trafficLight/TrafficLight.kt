package trafficLight

import states.implementations.GreenLightState
import states.implementations.RedLightState
import states.implementations.YellowLightState
import states.interfaces.TrafficLightState

class TrafficLight {
    val redLightState : TrafficLightState = RedLightState(this)
    val yellowLightState : TrafficLightState = YellowLightState(this)
    val greenLightState : TrafficLightState = GreenLightState(this)

    private var currentState = redLightState

    fun setState(state: TrafficLightState) {
        currentState = state
    }

    fun redLight() {
        currentState.redLight()
    }

    fun yellowLight() {
        currentState.yellowLight()
    }

    fun greenLight() {
        currentState.greenLight()
    }
}