class Button(initialState: Boolean = false) extends Observable {

  private var state: Boolean = initialState

  def press(): Unit = {
    state = !state
    notifyObservers(Component(ComponentType.Button, state))
  }

}

