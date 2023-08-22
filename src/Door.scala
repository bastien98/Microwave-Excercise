class Door( initialState: Boolean = false) extends Observable {

  private var state: Boolean = initialState

  def change(): Unit = {
    state = !state
    notifyObservers(Component(ComponentType.Door, state = state))
  }

  def getState: Boolean = state
}
