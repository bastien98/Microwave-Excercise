class Heater(initialState: Boolean = false) extends Observable {

  private var state: Boolean = initialState

  def change(): Unit = {
    state = !state
    notifyObservers(Component(ComponentType.Heater, state))
  }

  def getState: Boolean = state

}
